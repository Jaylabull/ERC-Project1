package com.reimbursement.servlets;

import java.io.IOException;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.reimbursement.controllers.LoginController;
import com.reimbursement.controllers.ReimbursementController;

import com.reimbursement.controllers.LogoutController;

public class ServletJSONHelper {

	public static void process(HttpServletRequest req, HttpServletResponse res) throws JsonProcessingException, IOException{
		System.out.println("In the ServletJSONHelper with URI: " + req.getRequestURI());
		switch(req.getRequestURI()) {
			case "/ERCProject1/api/login":
				System.out.println("ServletJSONHelper: Case 1");
				LoginController.login(req, res);
				break;
			case "/ERCProject1/api/logout":
				System.out.println("ServletJSONHelper: Case 2");
				LogoutController.logout(req, res);
				break;
			case "/ERCProject1/api/employeeHome":
				System.out.println("ServletJSONHelper: Case 3");
				ReimbursementController.selectAllReimbursements(req, res);
				break;
//			case "/ERCProject1/api/session":
//				SessionController.getSession(req, res);
//				break;
		}
	}
}
	