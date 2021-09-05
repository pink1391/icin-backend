package com.onlinetest.entity.exam;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "chequeRequest")
public class Cheque {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long requestId;
	private String accountNo;
	private Long userId;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date requestDate;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date approvalDate = null;
	private String status = "Not Approved";
	public Cheque() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cheque(Long requestId, String accountNo, Long userId, Date requestDate, Date approvalDate, String status) {
		super();
		this.requestId = requestId;
		this.accountNo = accountNo;
		this.userId = userId;
		this.requestDate = requestDate;
		this.approvalDate = approvalDate;
		this.status = status;
	}
	public Long getRequestId() {
		return requestId;
	}
	public void setRequestId(Long requestId) {
		this.requestId = requestId;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Date getRequestDate() {
		return requestDate;
	}
	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}
	public Date getApprovalDate() {
		return approvalDate;
	}
	public void setApprovalDate(Date approvalDate) {
		this.approvalDate = approvalDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
