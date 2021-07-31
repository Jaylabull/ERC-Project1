package com.reimbursement.dao;

import java.util.List;

import com.reimbursement.models.User;
import com.reimbursement.models.UserRole;

public interface UserDao {
	
	public void createUser(User user);
	
	public void updateUser(User user);
	
	public User selectByUserId(int userId);
	
	public List<User> selectAllUsers();
	
	public UserRole updateUser(String userRole);
	
}
