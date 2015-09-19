package com.dorjear.ralf.form.branch;

import com.dorjear.ralf.form.FormBranch;
import com.dorjear.ralf.form.base.FormRequestBase;

public class FormBranchRequestBase extends FormRequestBase {
	private FormBranch branch;

	public FormBranch getBranch() {
		return branch;
	}

	public void setBranch(FormBranch branch) {
		this.branch = branch;
	}
	
}
