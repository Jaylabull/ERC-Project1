package com.reimbursement.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.reimbursement.models.Reimbursement;
import com.reimbursement.util.HibernateUtil;

public class ReimbursementDaoDB implements ReimbursementDao{
	public ReimbursementDaoDB() {
		
	}
	
	public void createReim(Reimbursement reimb) {
		Session ses = HibernateUtil.getSession();
		Transaction tx = ses.beginTransaction();
		ses.save(reimb);
		tx.commit();
	}
	
	public void updateReim(Reimbursement reimb) {
		Session ses = HibernateUtil.getSession();
		Transaction tx = ses.beginTransaction();
		ses.update(reimb);
		tx.commit();
	}
	
	public Reimbursement selectByReimbId(int reimbId) {
		Session ses = HibernateUtil.getSession();
		Reimbursement reimb = ses.get(Reimbursement.class, reimbId);
		return reimb;
	}
	
	public List<Reimbursement> selectAllReimb(){
		Session ses = HibernateUtil.getSession();
		List<Reimbursement> rList = ses.createQuery("from Reimbursement", Reimbursement.class).list();
		return rList;
	}
	
	
	
	
}
