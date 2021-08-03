package com.reimbursement.controllers;

import java.io.BufferedReader;
import java.io.IOException;
import com.reimbursement.models.User;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.reimbursement.dao.UserDao;
import com.reimbursement.dao.UserDaoDB;
import com.reimbursement.services.UserServices;

public class LoginController {

	private static UserDao uDao = new UserDaoDB();
	private static UserServices uServ = new UserServices(uDao);
	
	public static void login(HttpServletRequest req, HttpServletResponse res) throws JsonProcessingException, IOException{
		
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
		
		String username = parsedObj.get("username").asText();
		String password = parsedObj.get("password").asText();
		
		try {
			System.out.println("In the login attempt");
			System.out.println(username);
			System.out.println(password);
			User u = uServ.signIn(username, password);
			System.out.println(u);
			
			req.getSession().setAttribute("id", u.getUserId());
			res.setStatus(HttpServletResponse.SC_OK);
			res.addHeader("Access-Control-Allow-Origin", "*");
			res.setHeader("Access-Control-Allow-Methods", "POST");
			res.getWriter().write(new ObjectMapper().writeValueAsString(u));
		}
		catch(Exception e) {
			System.out.println("Getting an exception");
			res.setStatus(HttpServletResponse.SC_FORBIDDEN);
			res.getWriter().println("Username or password incorrect.");
		}

		
		
		
	}
	
	
	
}
