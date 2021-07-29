package com.reimbursement.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reimbursement_status")
public class ReimbursementStatus {

	@Id
	@Column(name = "reimbursement_status")
	private String reimbursement_status;

	public ReimbursementStatus() {
	
	}

	public ReimbursementStatus(String reimbursement_status) {
		this.reimbursement_status = reimbursement_status;
	}

	public String getReimbursement_status() {
		return reimbursement_status;
	}

	public void setReimbursement_status(String reimbursement_status) {
		this.reimbursement_status = reimbursement_status;
	}

	@Override
	public String toString() {
		return "ReimbursementStatus [reimbursement_status=" + reimbursement_status + "]";
	}
	
	
}
