package com.reimbursement.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogoutController {

	public static String logout(HttpServletRequest req, HttpServletResponse res) throws IOException {
	
		req.getSession().invalidate();
		res.setStatus(200);
		res.getWriter().println("User logged out");
		
		return  "resources/html/landingpg.html";
	}
	
}

