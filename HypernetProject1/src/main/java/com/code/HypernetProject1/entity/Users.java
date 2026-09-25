package com.code.HypernetProject1.entity;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class Users {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="user_id")
	private int UserId;
	@Column(name="user_name",length=50,nullable=false,unique=true)
	private String UserName;
	@Column(name="password",length=60, nullable=false)
	private String password;
	@Column(name="email", length=40,nullable=false,unique=true)
	private String email;
	
	public enum Role{
		Admin,
		Customer
	}
	@Enumerated(EnumType.STRING)
	@Column(name="role",length=10,nullable=false)
	private Role role;
	
	@OneToMany(mappedBy = "users", cascade = CascadeType.ALL)
	private List<Orders> orders;
	

	//default constructor
	public Users() {
		this.UserId=0;
		this.UserName=null;
		this.password=null;
		this.email=null; 
	
}
	//parameterized constructor

	public Users(String userName, String password, String email, Role role) {
		super();
		UserName = userName;
		this.password = password;
		this.email = email;
		this.role = role;
	}
	//getter and setter

	public int getUserId() {
		return UserId;
	}

	public void setUserId(int userId) {
		UserId = userId;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	//toString Method

	@Override
	public String toString() {
		return "Users [UserId=" + UserId + ", UserName=" + UserName + ", password=" + password + ", email=" + email
				+ ", role=" + role + "]";
	}
	
}
