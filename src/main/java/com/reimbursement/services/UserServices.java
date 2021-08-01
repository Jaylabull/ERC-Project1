package com.reimbursement.services;



import java.sql.SQLException;

import com.reimbursement.dao.UserDao;
import com.reimbursement.exceptions.InvalidCredentialsException;
import com.reimbursement.exceptions.UserDoesNotExistException;
import com.reimbursement.exceptions.UserNameAlreadyExistsException;
import com.reimbursement.logging.Logging;
import com.reimbursement.models.User;

public class UserServices {

	private UserDao uDao;
	
	public UserServices(UserDao u) {
		this.uDao = u;
	}
	
	public User signUp(String firstname, String lastname, String email, String password) throws UserNameAlreadyExistsException, SQLException{
	
		User newUser = new User(firstname, lastname, email, password);
		uDao.createUser(newUser);
		Logging.logger.info("New user has registered.");
		
		return newUser;
		
	}
	
	public User signIn(String username, String password) throws UserDoesNotExistException, InvalidCredentialsException{
		User user = uDao.selectByUsername(username);
		
		if(user.getUserId() == 0) {
			Logging.logger.warn("User tried logging in with a username that does not exist.");
			throw new UserDoesNotExistException();
		}
		else if(!user.getPassword().equals(password)) {
			Logging.logger.warn("User tried logging in with invalid credentials.");
			throw new InvalidCredentialsException();
		}
		else {
			Logging.logger.info("User was logged in.");
			return user;
		}
	}
	
	
	
	
	
}//End UserServices Class
