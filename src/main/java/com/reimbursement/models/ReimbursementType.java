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
@Table(name = "reimbursement_type")
public class ReimbursementType {

	@Id
	@Column(name = "type_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int typeId;
	
	
	@Column(name = "reimbursement_type")
	private String reimbursement_type;
	
	@OneToMany(mappedBy = "rType", fetch = FetchType.LAZY)
	private List<Reimbursement> reimList = new ArrayList<Reimbursement>();
	
	
	public ReimbursementType() {
		
	}

	public ReimbursementType(String reimbursement_type) {
		super();
		this.reimbursement_type = reimbursement_type;
	}

	public ReimbursementType(int typeId, String reimbursement_type) {
		super();
		this.typeId = typeId;
		this.reimbursement_type = reimbursement_type;
	}
	
	public ReimbursementType(int typeId, String reimbursement_type, List<Reimbursement> reimList) {
		super();
		this.typeId = typeId;
		this.reimbursement_type = reimbursement_type;
		this.reimList = reimList;
	}

	public String getReimbursement_type() {
		return reimbursement_type;
	}

	public void setReimbursement_type(String reimbursement_type) {
		this.reimbursement_type = reimbursement_type;
	}

	@Override
	public String toString() {
		return "ReimbursementType [typeId=" + typeId + ", reimbursement_type=" + reimbursement_type + ", reimList="
				+ reimList + "]";
	}

	
}
