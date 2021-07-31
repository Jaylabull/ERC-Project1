package com.reimbursement.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "reimbursement_status")
public class ReimbursementStatus {

	@Id
	@Column(name = "status_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int statusId;
	
	@Column(name = "reimbursement_status")
	private String reimbursement_status;
	
	@OneToMany(mappedBy = "rStatus", fetch = FetchType.LAZY)
	private List<Reimbursement> reimList = new ArrayList<Reimbursement>();

	public ReimbursementStatus() {
	
	}

	public ReimbursementStatus(String reimbursement_status) {
		this.reimbursement_status = reimbursement_status;
	}
	
	public ReimbursementStatus(int statusId, String reimbursement_status) {
		super();
		this.statusId = statusId;
		this.reimbursement_status = reimbursement_status;
	}
	
	public ReimbursementStatus(int statusId, String reimbursement_status, List<Reimbursement> reimList) {
		super();
		this.statusId = statusId;
		this.reimbursement_status = reimbursement_status;
		this.reimList = reimList;
	}

	public String getReimbursement_status() {
		return reimbursement_status;
	}

	public void setReimbursement_status(String reimbursement_status) {
		this.reimbursement_status = reimbursement_status;
	}
	
	public int getStatusId() {
		return statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	public List<Reimbursement> getReimList() {
		return reimList;
	}

	public void setReimList(List<Reimbursement> reimList) {
		this.reimList = reimList;
	}

	@Override
	public String toString() {
		return "ReimbursementStatus [reimbursement_status=" + reimbursement_status + "]";
	}
	
	
}
