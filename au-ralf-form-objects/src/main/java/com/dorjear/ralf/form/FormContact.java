package com.dorjear.ralf.form;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

public class FormContact {
	
	@Size(min = 5, max = 30)
	private String appRefNumber;
	
	private Long ralfCustomerId;
	
	@Pattern(regexp = "^$|M|P")
	private String applicantType;
	
	@Pattern(regexp = "^$|E|M|P")
	private String contactType;
	
	@NotBlank
	@Size(max = 4000)
	private String content;
	
	private String status;
	
	private String errorMessage;
	
	@NotBlank
	@Size(min = 5, max = 20)
	private String createdBy;
	
	@Pattern(regexp = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/(19|20)[0-9][0-9]$")
	private String createDate;
	
	private String createTime;

	public String getAppRefNumber() {
		return appRefNumber;
	}

	public void setAppRefNumber(String appRefNumber) {
		this.appRefNumber = appRefNumber;
	}

	public Long getRalfCustomerId() {
		return ralfCustomerId;
	}

	public void setRalfCustomerId(Long ralfCustomerId) {
		this.ralfCustomerId = ralfCustomerId;
	}

	public String getApplicantType() {
		return applicantType;
	}

	public void setApplicantType(String applicantType) {
		this.applicantType = applicantType;
	}

	public String getContactType() {
		return contactType;
	}

	public void setContactType(String contactType) {
		this.contactType = contactType;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	
}
