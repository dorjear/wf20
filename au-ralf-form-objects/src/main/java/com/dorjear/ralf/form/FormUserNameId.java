package com.dorjear.ralf.form;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;



public class FormUserNameId {
	
	@NotBlank
	@Size(min = 5, max = 20)
	private String userId;
	
	@NotBlank
	@Size(max = 60)
	private String firstName;
	
	@NotBlank
	@Size(max = 60)
	private String middleName;
	
	@NotBlank
	@Size(max = 60)
	private String lastName;
	
	@Unique
	private String[] branches;
	
	@Size(max = 3)
	private String primaryBranch;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String[] getBranches() {
		return branches;
	}

	public void setBranches(String[] branches) {
		this.branches = branches;
	}

	public String getPrimaryBranch() {
		return primaryBranch;
	}

	public void setPrimaryBranch(String primaryBranch) {
		this.primaryBranch = primaryBranch;
	}
	
}
