package com.application.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Donor 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int donor_id;
	private String name;
	private int age;
	private String gender;	
	private String address;
	private String city;
	
	@Column(name="bloodgroup")
	private String bloodGroup;
	
	private String mobile;
	private String date;
	private int units;
	private int user_id;
	
	
	
	
	public Donor()
	{

	}

	@Override
	public String toString() {
		return "Donor [donor_id=" + donor_id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", address="
				+ address + ", city=" + city + ", bloodGroup=" + bloodGroup + ", mobile=" + mobile + ", date=" + date
				+ ", units=" + units + ", user_id=" + user_id + "]";
	}

	public int getDonor_id() {
		return donor_id;
	}

	public void setDonor_id(int donor_id) {
		this.donor_id = donor_id;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getUnits() {
		return units;
	}

	public void setUnits(int units) {
		this.units = units;
	}

//	public User getUser() {
//		return user;
//	}
//
//	public void setUser(User user) {
//		this.user = user;
//	}

	public Donor(int donor_id, String name, int age, String gender, String address, String city, String bloodGroup,
			String mobile, String date, int units, int user_id) {
		super();
		this.donor_id = donor_id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.city = city;
		this.bloodGroup = bloodGroup;
		this.mobile = mobile;
		this.date = date;
		this.units = units;
		this.user_id = user_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}


}