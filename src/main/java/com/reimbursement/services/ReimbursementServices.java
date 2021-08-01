package com.reimbursement.services;

import java.util.List;

import com.reimbursement.dao.ReimbursementDaoDB;
import com.reimbursement.models.Reimbursement;
import com.reimbursement.models.ReimbursementStatus;


public class ReimbursementServices {

	private ReimbursementDaoDB rDao;
	
	public ReimbursementServices(ReimbursementDaoDB reim) {
		this.rDao = reim;
	}
	
	//Selects all reimbursements
	public List<Reimbursement> selectAllReimbursements(){
		
		List<Reimbursement> rList = rDao.selectAllReimb();		
		
		return rList;
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
