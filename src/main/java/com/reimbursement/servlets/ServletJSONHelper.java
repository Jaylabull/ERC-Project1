package com.reimbursement.servlets;

import java.io.IOException;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.reimbursement.controllers.LoginController;



public class ServletJSONHelper {

	public static void process(HttpServletRequest req, HttpServletResponse res) throws JsonProcessingException, IOException{
		System.out.println("In the ServletJSONHelper with URI: " + req.getRequestURI());
		switch(req.getRequestURI()) {
			case "/ERCProject1/api/login":
				LoginController.login(req, res);
				break;
//			case "/ERCProject1/api/logout":
//				LogoutController.logout(req, res);
//				break;
//			case "/SERCProject1/api/posts":
//				PostsController.handlePosts(req, res);
//				break;
//			case "/ERCProject1/api/session":
//				SessionController.getSession(req, res);
//				break;
		}
	}
}
