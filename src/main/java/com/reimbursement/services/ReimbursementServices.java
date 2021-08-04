package com.reimbursement.services;

import java.util.List;

import com.reimbursement.dao.ReimbursementDaoDB;
import com.reimbursement.dao.UserDaoDB;
import com.reimbursement.models.Reimbursement;
import com.reimbursement.models.ReimbursementStatus;
import com.reimbursement.models.ReimbursementType;


public class ReimbursementServices {

	private ReimbursementDaoDB rDao;
	private UserDaoDB uDao;
	
	public ReimbursementServices(ReimbursementDaoDB reim) {
		this.rDao = reim;
	}
	
	public ReimbursementServices(ReimbursementDaoDB r, UserDaoDB u) {
		this.rDao = r;
		this.uDao = u;
	}

	//Selects all reimbursements
	public List<Reimbursement> selectAllReimbursements(){
		
		List<Reimbursement> rList = rDao.selectAllReimb();		
		
		return rList;
	}
	
	//Selects user by id
	public List<Reimbursement> getAllRemib(){
		return rDao.selectAllReimb();
	}
	
	public void addReimbursement(int amt, String descp) {
		Reimbursement r = new Reimbursement(amt, descp);
		rDao.createReim(r);
	}
	
	//Select reimbursements by status 
//	public List<Reimbursement> selectReimbursementByStatus(String status){
//		
//		List<Reimbursement> rList = rDao.selectReimbursementByStatus(status);
//		
//		return rList;	
//		
//	}
	
}
