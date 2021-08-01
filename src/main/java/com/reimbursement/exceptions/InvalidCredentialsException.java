package com.reimbursement.exceptions;

public class InvalidCredentialsException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public InvalidCredentialsException() {
		super("User tried logging with with invalid credentials.");
	}

}
