package com.reimbursement.services;



import java.sql.SQLException;

import com.reimbursement.dao.UserDao;
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
	
	
}//End UserServices Class
