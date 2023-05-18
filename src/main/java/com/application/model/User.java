package com.application.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class User 
{


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String username;
	private String email;
	private String bloodgroup;
	private String gender;
	private String password;



	public User() 
	{

	}

	public User(int id, String name, String username, String email, String bloodgroup,String gender, String password, Donor donor) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.email = email;
		this.bloodgroup=bloodgroup;
		this.gender = gender;
		this.password = password;
//		this.donor = donor;
	}


	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", username=" + username + ", email=" + email + ",bloodgroup=" +bloodgroup+" gender="
			+ gender + ", password=" + password+ "]";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


//	public Donor getDonor() {
//		return donor;
//	}
//
//
//	public void setDonor(Donor donor) {
//		this.donor = donor;
//	}


	public String getBloodgroup() {
		return bloodgroup;
	}

	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}



}