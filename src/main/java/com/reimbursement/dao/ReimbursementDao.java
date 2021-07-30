package com.reimbursement.dao;

import java.util.List;

import com.reimbursement.models.Reimbursement;

public interface ReimbursementDao {
	
	public void createReim(Reimbursement reimb);

	public void updateReim(Reimbursement reimb);
	
	public Reimbursement selectByReimbId(int reimbId);
	
	public List<Reimbursement> selectAllReimb();
	
}
