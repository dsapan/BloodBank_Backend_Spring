package com.application.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.print.event.PrintJobAttributeEvent;

@Entity
public class Requesting 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int request_id;
    private String name;
    private int age;
    private String mobile;
    private String bloodgroup;
    private String disease;
    private int units;
    private String status;
    private String gender;
    private String date;
    
    public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	private String email;
    private int user_id;
    
    
    

    
	public Requesting()
	{
	}



	@Override
	public String toString() {
		return "Requesting [request_id=" + request_id + ", name=" + name + ", age=" + age + ", mobile=" + mobile
				+ ", bloodgroup=" + bloodgroup + ", disease=" + disease + ", units=" + units + ", status=" + status
				+ ", gender=" + gender + ", date=" + date + ", email=" + email + ", user_id=" + user_id + "]";
	}

	public int getRequest_id() {
		return request_id;
	}

	public void setRequest_id(int request_id) {
		this.request_id = request_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getBloodgroup() {
		return bloodgroup;
	}

	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public int getUnits() {
		return units;
	}

	public void setUnits(int units) {
		this.units = units;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

//	public User getUser() {
//		return user;
//	}
//
//	public void setUser(User user) {
//		this.user = user;
//	}



	public int getUser_id() {
		return user_id;
	}

	public Requesting(int request_id, String name, int age, String mobile, String bloodgroup, String disease, int units,
		String status, String gender, String date, String email, int user_id) {
	super();
	this.request_id = request_id;
	this.name = name;
	this.age = age;
	this.mobile = mobile;
	this.bloodgroup = bloodgroup;
	this.disease = disease;
	this.units = units;
	this.status = status;
	this.gender = gender;
	this.date = date;
	this.email = email;
	this.user_id = user_id;
}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	
	


    
}