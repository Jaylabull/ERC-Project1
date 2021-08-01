package com.reimbursement.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		
		req.getRequestDispatcher("login.html").forward(req, res);
	}

//protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
//		
//	//The quoted "username" is a parameter in the login.html 
//	// .getParameter() gets the data from a form
//		String username = req.getParameter("username");
//		String password = req.getParameter("password");
//		
//		//Printing to console to make sure we are receiving info from form
//		System.out.println(username);
//		System.out.println(password);
//		
//	}
	
	
}
