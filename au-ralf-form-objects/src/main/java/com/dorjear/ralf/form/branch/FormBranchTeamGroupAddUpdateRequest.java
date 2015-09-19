package com.dorjear.ralf.form.branch;
import com.dorjear.ralf.form.base.FormRequestBase;

public class FormBranchTeamGroupAddUpdateRequest extends FormRequestBase {
	
	private long teamGroupId;
	private String branchCode;
	private String name;
	private boolean allowAutoAllocation;
	
	public long getTeamGroupId() {
		return teamGroupId;
	}
	public void setTeamGroupId(long teamGroupId) {
		this.teamGroupId = teamGroupId;
	}
	public String getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isAllowAutoAllocation() {
		return allowAutoAllocation;
	}
	public void setAllowAutoAllocation(boolean allowAutoAllocation) {
		this.allowAutoAllocation = allowAutoAllocation;
	}

	
	
	
	
	
	
	

}
