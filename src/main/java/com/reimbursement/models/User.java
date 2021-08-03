package com.reimbursement.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "users")
public class User {
	
	@Id
	@Column(name = "user_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	
	@Column(name = "user_name", nullable = false)
	private String username;
	
	@Column(name = "first_name", nullable = false)
	private String firstname;
	
	@Column(name = "last_name", nullable = false)
	private String lastname;
	
	@Column(name = "email", nullable = false, unique = true)
	private String email;
	
	@Column(name = "password", nullable = false)
	private String password;
	
	@OneToMany(mappedBy = "rResolver", fetch = FetchType.LAZY)
	private List<Reimbursement> remList = new ArrayList<Reimbursement>();
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "uRole_FK")
	private UserRole uRole;
	
	@OneToMany(mappedBy = "rAuthor", fetch = FetchType.LAZY)
	private List<Reimbursement> reimList = new ArrayList<Reimbursement>();
		
	public User() {
		
	}
	
	public User(String firstname, String lastname, String email, String password) {
		super();
		this.setUserId(new Random().nextInt(9000) + 1000);
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
	}
	
	

	public User(int userId, String username, String firstname, String lastname, String email, String password,
			UserRole uRole) {
		super();
		this.userId = userId;
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.uRole = uRole;
	}

	public User(int userId, String firstname, String lastname, String email, String password) {
		super();
		this.setUserId(new Random().nextInt(9000) + 1000);
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
	}

	public User(String firstname, String lastname, String email, String password, UserRole uRole) {
		super();
		this.setUserId(new Random().nextInt(9000) + 1000);
		this.username = firstname + lastname + (new Random().nextInt(9000) + 1000);
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.uRole = uRole;
	}
	

	public User(int userId, String firstname, String lastname, String email, String password, UserRole uRole) {
		super();
		this.setUserId(new Random().nextInt(9000) + 1000);
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.uRole = uRole;
	}

	public User(String firstname, String lastname, String email, String password, List<Reimbursement> remList,
			UserRole uRole) {
		super();
		this.setUserId(new Random().nextInt(9000) + 1000);
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.remList = remList;
		this.uRole = uRole;
	}

	public User(int userId, String username, String firstname, String lastname, String email, String password,
			List<Reimbursement> remList, UserRole uRole) {
		super();
		this.setUserId(new Random().nextInt(9000) + 1000);
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.remList = remList;
		this.uRole = uRole;
	}


	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Reimbursement> getRemList() {
		return remList;
	}


	public void setRemList(List<Reimbursement> remList) {
		this.remList = remList;
	}

	public UserRole getuRole() {
		return uRole;
	}

	public void setuRole(UserRole uRole) {
		this.uRole = uRole;
	}

	public List<Reimbursement> getReimList() {
		return reimList;
	}

	public void setReimList(List<Reimbursement> reimList) {
		this.reimList = reimList;
	}


	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", firstname=" + firstname + ", lastname="
				+ lastname + ", email=" + email + ", password=" + password + "]";
	}
	

}//End User Class
