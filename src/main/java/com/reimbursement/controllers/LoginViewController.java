package com.reimbursement.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

public class LoginViewController {

	public static String fetchLoginPage(HttpServletRequest req) throws ServletException, IOException {
		System.out.println(req.getContentType());
		System.out.println("This should return the view login.html");
		return "resources/html/login.html";
		
	}
	
	public static String getEmployeeHome(HttpServletRequest req) throws ServletException, IOException{
		System.out.println(req.getContentType());
		System.out.println("This should return the view employeeHome.html");
		return  "resources/html/employeeHome.html";
	}
	
	public static String getManagerHome(HttpServletRequest req) throws ServletException, IOException{
		System.out.println(req.getContentType());
		System.out.println("This should return the view managerHome.html");
		return  "resources/html/ManagerHome.html";
	}
	
//	public static String logout(HttpServletRequest req) throws ServletException, IOException{
//		System.out.println(req.getContentType());
//		System.out.println("This should return the view landingpg.html");
//		return  "resources/html/landingpg.html";
//	}
	
}	