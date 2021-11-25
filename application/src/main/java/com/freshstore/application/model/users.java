package com.freshstore.application.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class users implements Serializable {

	@Id
	@Column(name="User_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
private Integer User_ID;
	
	private String First_Name;
	
	private String Last_Name;
	
	private String Email;
	
	private String CountryCode;
	
	private String Phone_Number;
	
	private String Gender;
	
	java.util.Date dt = new java.util.Date();

	java.text.SimpleDateFormat sdf = 
	     new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	private String Date_Created = sdf.format(dt);
	
	private int Is_Admin;
	
	private int Subscription;

	public Integer getUser_ID() {
		return User_ID;
	}

	public void setUser_ID(Integer user_ID) {
		User_ID = user_ID;
	}

	public String getFirst_Name() {
		return First_Name;
	}

	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}

	public String getLast_Name() {
		return Last_Name;
	}

	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getCountryCode() {
		return CountryCode;
	}

	public void setCountryCode(String countryCode) {
		CountryCode = countryCode;
	}

	public String getPhone_Number() {
		return Phone_Number;
	}

	public void setPhone_Number(String phone_Number) {
		Phone_Number = phone_Number;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public java.util.Date getDt() {
		return dt;
	}

	public void setDt(java.util.Date dt) {
		this.dt = dt;
	}

	public java.text.SimpleDateFormat getSdf() {
		return sdf;
	}

	public void setSdf(java.text.SimpleDateFormat sdf) {
		this.sdf = sdf;
	}

	public String getDate_Created() {
		return Date_Created;
	}

	public void setDate_Created(String date_Created) {
		Date_Created = date_Created;
	}

	public int getIs_Admin() {
		return Is_Admin;
	}

	public void setIs_Admin(int is_Admin) {
		Is_Admin = is_Admin;
	}

	public int getSubscription() {
		return Subscription;
	}

	public void setSubscription(int subscription) {
		Subscription = subscription;
	}

}
