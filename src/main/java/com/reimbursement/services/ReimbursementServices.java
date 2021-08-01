package com.reimbursement.services;

import java.util.List;

import com.reimbursement.dao.ReimbursementDaoDB;
import com.reimbursement.models.Reimbursement;


public class ReimbursementServices {

	private ReimbursementDaoDB rDao;
	
	public ReimbursementServices(ReimbursementDaoDB reim) {
		this.rDao = reim;
	}
	
	public List<Reimbursement> allReimbursements(){
		
		List<Reimbursement> rList = rDao.selectAllReimb();		
		
		return rList;
	}
	
}
