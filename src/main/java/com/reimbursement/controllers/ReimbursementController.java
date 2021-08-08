package com.reimbursement.controllers;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.reimbursement.dao.ReimbursementDaoDB;
import com.reimbursement.dao.UserDaoDB;
import com.reimbursement.models.Reimbursement;
import com.reimbursement.models.ReimbursementStatus;
import com.reimbursement.models.ReimbursementType;
import com.reimbursement.models.User;
import com.reimbursement.services.ReimbursementServices;
import com.reimbursement.services.UserServices;

public class ReimbursementController {

	private static ReimbursementDaoDB rDao = new ReimbursementDaoDB();
	private static UserDaoDB uDao = new UserDaoDB();
	private static ReimbursementServices rServ = new ReimbursementServices(rDao, uDao);
	private static UserServices uServ = new UserServices(uDao);
	private static ReimbursementType rType = new ReimbursementType();
	private static ReimbursementStatus rStatus = new ReimbursementStatus();
	
	
	public static void viewReimbursements(HttpServletRequest req, HttpServletResponse res)throws JsonProcessingException, IOException{
		
		
		List<Reimbursement> rList = rServ.selectAllReimbursements();
		System.out.println(rList);
		res.addHeader("Access-Control-Allow-Origin", "*");
		res.setHeader("Access-Control-Allow-Methods", "GET");
		res.getWriter().write(new ObjectMapper().writeValueAsString(rList));
		
	}
	
	
	public static void addReimbursements(HttpServletRequest req, HttpServletResponse res) throws JsonProcessingException, IOException{
//		if(req.getMethod().equals("GET")) {
//		}
//		else {
//		}
			StringBuilder buffer = new StringBuilder();
			BufferedReader reader = req.getReader();
			
			String line;
			while((line = reader.readLine()) != null) {
				buffer.append(line);
				buffer.append(System.lineSeparator());
			}
			String data = buffer.toString();
			System.out.println(data);
			ObjectMapper mapper = new ObjectMapper();
			JsonNode parsedObj = mapper.readTree(data);
			
			
			
			
			int userId = Integer.parseInt(parsedObj.get("userId").asText());
			int amount = Integer.parseInt(parsedObj.get("amount").asText());
			String content = parsedObj.get("content").asText();
			//int roleId = Integer.parseInt(parsedObj.get("roleId").asText());
//			System.out.println(userId);
			User u = uServ.getUserById(userId);
			
//			ReimbursementType rType = new ReimbursementType();
//			rType.getTypeId();
			
			ReimbursementType rType = rDao.selectByRType(userId);
			
			rServ.addReimbursements(u, amount, content, rType);
			
			
			ObjectNode ret = mapper.createObjectNode();
			//ret.put("user_id", u.getUserId());
			//ret.put("uRole", u.getuRole());
		
			
			ret.put("message", "successfully submitted a new reimbursment");
			res.addHeader("Access-Control-Allow-Origin", "*");
			res.setHeader("Access-Control-Allow-Methods", "POST");
			res.getWriter().write(new ObjectMapper().writeValueAsString(ret));	

	}
}
