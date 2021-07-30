package com.reimbursement.dao;

import java.util.List;

import com.reimbursement.models.User;

public interface UserDao {
	
	public void createUser(User user);
	
	public void updateUser(User user);
	
	public User selectByUserId(int userId);
	
	public List<User> selectAllUsers();
	
}
