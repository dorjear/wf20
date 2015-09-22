package com.dorjear.ralf.form;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

public class FormUser {
	@NotBlank
	@Size(min = 5, max = 20)
	private String userId;
	
	@NotBlank
	@Size(min = 5, max = 20)
	private String password;

	@Size(min = 1)
	private String[] roles;
	
	@NotBlank
	@Size(max = 60)
	private String firstName;
	
	@NotBlank
	@Size(max = 60)
	private String middleName;
	
	@NotBlank
	@Size(max = 60)
	private String lastName;
	
	@NotBlank
	@Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9-]+(\\.[a-zA-Z]{2,6})+$")
	@Size(max = 100)
	@Email
	private String email;
	
	@Pattern(regexp = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/(19|20)[0-9][0-9]$")
	private String outofficeStart;
	
	@Pattern(regexp = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/(19|20)[0-9][0-9]$")
	private String outofficeEnd;
	
	@Size(max = 1)
	private String riskType;
	
	@Unique
	private String[] productGroups;
	
	private Boolean campaignEditor;
	
	@Unique
	private String[] regions;
	
	@Unique
	private String[] branches;
	
	@Unique
	private String[] teams;
	
	@Size(max = 3)
	private String primaryBranch;
	
	@Size(max = 20)
	private String managerId;
	
	private Boolean readonly;
	
	@Size(max = 20)
	private String mobile;
	
	@Size(max = 9)
	private String hubId;
	
	private Boolean idApprover;
	private Boolean appSubmitter;
	private Boolean autoAllocation;
	private Integer bulkAllocationCapacity;
	private Boolean allowClickToAssist;
	
	@Size(max = 100)
	private String emailPreferredName;
	
	@Size(max = 100)
	private String emailSignatureName;
	
	@Size(max = 100)
	private String smsPreferredName;
	
	@Size(max = 20)
	private String workPhone;
	
	@Size(max = 20)
	private String relationshipManagerCode;
	private Boolean allowAccessStaffProfile;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String[] getRoles() {
		return roles;
	}
	public void setRoles(String[] roles) {
		this.roles = roles;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getOutofficeStart() {
		return outofficeStart;
	}
	public void setOutofficeStart(String outofficeStart) {
		this.outofficeStart = outofficeStart;
	}
	public String getOutofficeEnd() {
		return outofficeEnd;
	}
	public void setOutofficeEnd(String outofficeEnd) {
		this.outofficeEnd = outofficeEnd;
	}
	public String getRiskType() {
		return riskType;
	}
	public void setRiskType(String riskType) {
		this.riskType = riskType;
	}
	public String[] getProductGroups() {
		return productGroups;
	}
	public void setProductGroups(String[] productGroups) {
		this.productGroups = productGroups;
	}
	public Boolean getCampaignEditor() {
		return campaignEditor;
	}
	public void setCampaignEditor(Boolean campaignEditor) {
		this.campaignEditor = campaignEditor;
	}
	public String[] getRegions() {
		return regions;
	}
	public void setRegions(String[] regions) {
		this.regions = regions;
	}
	public String[] getBranches() {
		return branches;
	}
	public void setBranches(String[] branches) {
		this.branches = branches;
	}
	public String[] getTeams() {
		return teams;
	}
	public void setTeams(String[] teams) {
		this.teams = teams;
	}
	public String getPrimaryBranch() {
		return primaryBranch;
	}
	public void setPrimaryBranch(String primaryBranch) {
		this.primaryBranch = primaryBranch;
	}
	public String getManagerId() {
		return managerId;
	}
	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}
	public Boolean getReadonly() {
		return readonly;
	}
	public void setReadonly(Boolean readonly) {
		this.readonly = readonly;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getHubId() {
		return hubId;
	}
	public void setHubId(String hubId) {
		this.hubId = hubId;
	}
	public Boolean getIdApprover() {
		return idApprover;
	}
	public void setIdApprover(Boolean idApprover) {
		this.idApprover = idApprover;
	}
	public Boolean getAppSubmitter() {
		return appSubmitter;
	}
	public void setAppSubmitter(Boolean appSubmitter) {
		this.appSubmitter = appSubmitter;
	}
	public Boolean getAutoAllocation() {
		return autoAllocation;
	}
	public void setAutoAllocation(Boolean autoAllocation) {
		this.autoAllocation = autoAllocation;
	}
	public Integer getBulkAllocationCapacity() {
		return bulkAllocationCapacity;
	}
	public void setBulkAllocationCapacity(Integer bulkAllocationCapacity) {
		this.bulkAllocationCapacity = bulkAllocationCapacity;
	}
	public Boolean getAllowClickToAssist() {
		return allowClickToAssist;
	}
	public void setAllowClickToAssist(Boolean allowClickToAssist) {
		this.allowClickToAssist = allowClickToAssist;
	}
	public String getEmailPreferredName() {
		return emailPreferredName;
	}
	public void setEmailPreferredName(String emailPreferredName) {
		this.emailPreferredName = emailPreferredName;
	}
	public String getEmailSignatureName() {
		return emailSignatureName;
	}
	public void setEmailSignatureName(String emailSignatureName) {
		this.emailSignatureName = emailSignatureName;
	}
	public String getSmsPreferredName() {
		return smsPreferredName;
	}
	public void setSmsPreferredName(String smsPreferredName) {
		this.smsPreferredName = smsPreferredName;
	}
	public String getWorkPhone() {
		return workPhone;
	}
	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}
	public String getRelationshipManagerCode() {
		return relationshipManagerCode;
	}
	public void setRelationshipManagerCode(String relationshipManagerCode) {
		this.relationshipManagerCode = relationshipManagerCode;
	}
	public Boolean getAllowAccessStaffProfile() {
		return allowAccessStaffProfile;
	}
	public void setAllowAccessStaffProfile(Boolean allowAccessStaffProfile) {
		this.allowAccessStaffProfile = allowAccessStaffProfile;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
