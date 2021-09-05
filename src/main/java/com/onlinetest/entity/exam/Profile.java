package com.onlinetest.entity.exam;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "profile")
public class Profile {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long profileId;
	private String name;
	private String fatherName;
	private String email;
	private String mobileNo;
	private String address;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date dob;
	private String accountNo;
	private String ifscCode;
	private Long userId;
	
	public Profile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Profile(Long profileId, String name, String fatherName, String email, String mobileNo, String address,
			Date dob, String accountNo, String ifscCode, Long userId) {
		super();
		this.profileId = profileId;
		this.name = name;
		this.fatherName = fatherName;
		this.email = email;
		this.mobileNo = mobileNo;
		this.address = address;
		this.dob = dob;
		this.accountNo = accountNo;
		this.ifscCode = ifscCode;
		this.userId = userId;
	}

	public Long getProfileId() {
		return profileId;
	}

	public void setProfileId(Long profileId) {
		this.profileId = profileId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	

	
	
}
