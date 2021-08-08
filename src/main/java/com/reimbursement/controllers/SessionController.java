package com.reimbursement.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class SessionController {
	public static void getSession(HttpServletRequest req, HttpServletResponse res) throws JsonProcessingException, IOException{
		
		System.out.println("In Session Controller");
		HttpSession session = req.getSession();
		
		ObjectMapper mapper = new ObjectMapper();
		
		ObjectNode sesInfo = mapper.createObjectNode();
		
		if(session.getAttribute("user_id") == null) {
			res.setStatus(404);
			res.getWriter().println("User is not logged in");
			return;
		}
		
		System.out.println(session.getAttribute("user_id"));
		
		sesInfo.put("user_id", session.getAttribute("user_id").toString());
		
		res.getWriter().write((new ObjectMapper().writeValueAsString(sesInfo)));
	}
	
	
}
