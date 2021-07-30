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
@Table(name = "user_role")
public class UserRole {
	
	@Id
	@Column(name = "userId")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	
	@Column(name = "user_role")
	private String userRole;
	
	@OneToMany(mappedBy = "uRole", fetch = FetchType.LAZY)
	private List<User> uList = new ArrayList<User>();

	public UserRole() {
		
	}
	
	public UserRole(String userRole) {
		this.userRole = userRole;
	}

	public UserRole(int userId, String userRole, List<User> uList) {
		super();
		this.userId = userId;
		this.userRole = userRole;
		this.uList = uList;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public List<User> getuList() {
		return uList;
	}

	public void setuList(List<User> uList) {
		this.uList = uList;
	}

	@Override
	public String toString() {
		return "UserRole [userId=" + userId + ", userRole=" + userRole + ", uList=" + uList + "]";
	}

	
	

}
