package com.reimbursement.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.reimbursement.util.HibernateUtil;
import com.reimbursement.models.User;

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
	
}