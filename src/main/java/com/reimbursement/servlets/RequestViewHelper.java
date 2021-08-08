package com.reimbursement.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import com.reimbursement.controllers.LoginViewController;
import com.reimbursement.controllers.LogoutController;

public class RequestViewHelper {

	//This is the class the will delegate tasks to certain controllers
	public static String process(HttpServletRequest req) throws ServletException, IOException {
		System.out.println("In the request helper, with the URI: " + req.getRequestURI());
		
		switch(req.getRequestURI()) {
			case "/ERCProject1/login":
				return LoginViewController.fetchLoginPage(req);
			case "/ERCProject1/employeeHome":
				return LoginViewController.getEmployeeHome(req);
//			case "/ERCProject1/logout":
//				return LogoutController.logout(req, null);
//			case "/ERCProject1/managerHome":
//				return LoginViewController.getManagerHome(req);
				

			default:
				return "/ERCProject1/login";
		}	
		
	}

}
