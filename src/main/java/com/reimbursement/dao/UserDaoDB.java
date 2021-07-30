package com.reimbursement.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.reimbursement.util.HibernateUtil;
import com.reimbursement.models.Reimbursement;
import com.reimbursement.models.User;
import com.reimbursement.models.UserRole;

public class UserDaoDB implements UserDao {

	public UserDaoDB() {
		
	}
	
	public void createUser(User user) {
		Session ses = HibernateUtil.getSession();
		Transaction tx = ses.beginTransaction();
		ses.save(user);
		tx.commit();
	}
	public void updateUser(User user) {
		Session ses = HibernateUtil.getSession();
		Transaction tx = ses.beginTransaction();
		ses.update(user);
		tx.commit();
	}
	public User selectByUserId(int userId) {
		Session ses = HibernateUtil.getSession();
		User user = ses.get(User.class, userId);
		return user;
	}
	
	public List<User> selectAllUsers(){
		Session ses = HibernateUtil.getSession();
		List<User> uList = ses.createQuery("from User", User.class).list();
		return uList;
	}

	public UserRole updateUser(String userRole) {
		Session ses = HibernateUtil.getSession();
		UserRole ur = ses.get(UserRole.class, userRole);
		ses.update(ur);
		return ur;
	}
	
	
}
