package com.reimbursement.models;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "reimbursements")
public class Reimbursement {
	
	@Id
	@Column(name = "reimb_id", nullable = false, unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int reimbursement_id;
	
	@Column(name = "reimb_amt", nullable = false)
	private int reimbursement_amt;
	
	@Column(name = "reimb_submit", nullable = false)
	private String reimbursement_submt;
	
	@Column(name = "reimb_resolve", nullable = false)
	private String reimbursement_resolv;
	
	@Column(name = "reimb_despt", nullable = false)
	private String reimbursement_despt;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "Reimbursements_FK")
	private User userReimbursements;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "reimb_type_FK")
	private ReimbursementType rType;

	public Reimbursement() {
	
	}

	public Reimbursement(int reimbursement_amt, String reimbursement_submt, String reimbursement_resolv,
			String reimbursement_despt) {
		this.reimbursement_amt = reimbursement_amt;
		this.reimbursement_submt = reimbursement_submt;
		this.reimbursement_resolv = reimbursement_resolv;
		this.reimbursement_despt = reimbursement_despt;
	}

	public Reimbursement(int reimbursement_id, int reimbursement_amt, String reimbursement_submt,
			String reimbursement_resolv, String reimbursement_despt) {
		super();
		this.reimbursement_id = reimbursement_id;
		this.reimbursement_amt = reimbursement_amt;
		this.reimbursement_submt = reimbursement_submt;
		this.reimbursement_resolv = reimbursement_resolv;
		this.reimbursement_despt = reimbursement_despt;
	}

	public int getReimbursement_id() {
		return reimbursement_id;
	}

	public void setReimbursement_id(int reimbursement_id) {
		this.reimbursement_id = reimbursement_id;
	}

	public int getReimbursement_amt() {
		return reimbursement_amt;
	}

	public void setReimbursement_amt(int reimbursement_amt) {
		this.reimbursement_amt = reimbursement_amt;
	}

	public String getReimbursement_submt() {
		return reimbursement_submt;
	}

	public void setReimbursement_submt(String reimbursement_submt) {
		this.reimbursement_submt = reimbursement_submt;
	}

	public String getReimbursement_resolv() {
		return reimbursement_resolv;
	}

	public void setReimbursement_resolv(String reimbursement_resolv) {
		this.reimbursement_resolv = reimbursement_resolv;
	}

	public String getReimbursement_despt() {
		return reimbursement_despt;
	}

	public void setReimbursement_despt(String reimbursement_despt) {
		this.reimbursement_despt = reimbursement_despt;
	}

	@Override
	public String toString() {
		return "Reimbursement [reimbursement_id=" + reimbursement_id + ", reimbursement_amt=" + reimbursement_amt
				+ ", reimbursement_submt=" + reimbursement_submt + ", reimbursement_resolv=" + reimbursement_resolv
				+ ", reimbursement_despt=" + reimbursement_despt + "]";
	}
	
}
