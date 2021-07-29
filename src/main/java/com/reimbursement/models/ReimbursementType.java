package com.reimbursement.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reimbursement_type")
public class ReimbursementType {

	@Id
	@Column(name = "reimbursement_type")
	private String reimbursement_type;
	
	public ReimbursementType() {
		
	}

	public ReimbursementType(String reimbursement_type) {
		super();
		this.reimbursement_type = reimbursement_type;
	}

	public String getReimbursement_type() {
		return reimbursement_type;
	}

	public void setReimbursement_type(String reimbursement_type) {
		this.reimbursement_type = reimbursement_type;
	}

	@Override
	public String toString() {
		return "ReimbursementType [reimbursement_type=" + reimbursement_type + "]";
	}
	
	
	
}
