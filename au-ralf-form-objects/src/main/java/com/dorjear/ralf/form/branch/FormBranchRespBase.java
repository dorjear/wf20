package com.dorjear.ralf.form.branch;

import com.dorjear.ralf.form.FormBranch;
import com.dorjear.ralf.form.base.FormResponseBase;

public class FormBranchRespBase extends FormResponseBase {
	private FormBranch branch;

	public FormBranch getBranch() {
		return branch;
	}

	public void setBranch(FormBranch branch) {
		this.branch = branch;
	}
	
}
