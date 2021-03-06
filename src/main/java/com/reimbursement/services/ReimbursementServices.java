package com.reimbursement.services;

import java.util.Date;
import java.util.List;

import com.reimbursement.dao.ReimbursementDaoDB;
import com.reimbursement.dao.UserDaoDB;
import com.reimbursement.models.Reimbursement;
import com.reimbursement.models.ReimbursementStatus;
import com.reimbursement.models.ReimbursementType;
import com.reimbursement.models.User;


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
	
	//Adds new reimbursement
	public Reimbursement addReimbursements(User rAuthor, int amt, String descp, ReimbursementType type) {
		Reimbursement r = new Reimbursement(rAuthor ,amt, descp, type);
		rDao.createReim(r);
		return r;
	}
	
	//Select Pending Reimbursements
	public List<Reimbursement> selectPendingReimb(){
		return rDao.selectPendingReimb();
	}
	
	
}
