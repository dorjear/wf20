package com.dorjear.ralf.db.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="TB_RALF_USER")
public class TbRalfUser {

	@Id
	@Column(name = "user_id", nullable = false, length=30)
	private String userId;
	
	@Column(name = "first_name", nullable = true, length=30)
	private String firstName;

	@Column(name = "middle_name", nullable = true, length=30)
	private String middleName;

	@Column(name = "last_name", nullable = true, length=30)
	private String lastName;

	@Column(name = "roles", nullable = true, length=30)
	private String roles;
	
	@Column(name = "email", nullable = true, length=30)
	private String email;

	@Column(name = "risk_type", nullable = true, length=30)
	private String riskType;

	@Column(name = "product_groups", nullable = true, length=30)
	private String productGroups;

	@Column(name = "regions", nullable = true, length=30)
	private String regions;

	@Column(name = "branches", nullable = true, length=30)
	private String branches;

	@Column(name = "teams", nullable = true, length=30)
	private String teams;

	@Column(name = "primary_branch", nullable = true, length=30)
	private String primaryBranch;

	@Column(name = "create_date", nullable = true)
	private Date createDate;
	
	@Column(name = "last_update_date", nullable = true)
	private Date lastUpdateDate;

	@Column(name = "detail", nullable = true, length=3000)
	@Lob
	private String detail;

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

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRiskType() {
		return riskType;
	}

	public void setRiskType(String riskType) {
		this.riskType = riskType;
	}

	public String getProductGroups() {
		return productGroups;
	}

	public void setProductGroups(String productGroups) {
		this.productGroups = productGroups;
	}

	public String getRegions() {
		return regions;
	}

	public void setRegions(String regions) {
		this.regions = regions;
	}

	public String getBranches() {
		return branches;
	}

	public void setBranches(String branches) {
		this.branches = branches;
	}

	public String getTeams() {
		return teams;
	}

	public void setTeams(String teams) {
		this.teams = teams;
	}

	public String getPrimaryBranch() {
		return primaryBranch;
	}

	public void setPrimaryBranch(String primaryBranch) {
		this.primaryBranch = primaryBranch;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}
	
	

}
