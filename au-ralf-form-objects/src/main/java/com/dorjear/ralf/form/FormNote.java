package com.dorjear.ralf.form;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

public class FormNote {
	
	@Size(min = 5, max = 30)
	private String appRefNumber;
	
    private Long ralfCustomerId;
	
	@Pattern(regexp = "^$|M|P")
    private String applicantType;
	
	@NotBlank
	@Size(max = 4000)
    private String content;
	
	private String noteType;
	
    private boolean important;
    
    @NotBlank
	@Size(min = 5, max = 20)
    private String createdBy;
    
    @Pattern(regexp = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/(19|20)[0-9][0-9]$")
    private String createDate;
    
    private String createTime;
    
    
	@NotBlank
	@Size(min = 5, max = 20)
    private String updatedBy;
    
    @Pattern(regexp = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/(19|20)[0-9][0-9]$")
    private String updateDate;
    
    private String updateTime;
    
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getNoteType() {
		return noteType;
	}
	public void setNoteType(String noteType) {
		this.noteType = noteType;
	}
	public boolean isImportant() {
		return important;
	}
	public void setImportant(boolean important) {
		this.important = important;
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
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	
	
}
