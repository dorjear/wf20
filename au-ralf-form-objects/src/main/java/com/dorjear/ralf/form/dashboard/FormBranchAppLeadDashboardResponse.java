package com.dorjear.ralf.form.dashboard;

import com.dorjear.ralf.form.FormBranchStatsRecord;
import com.dorjear.ralf.form.base.FormResponseBase;

public class FormBranchAppLeadDashboardResponse extends FormResponseBase {
	private FormBranchStatsRecord[] stats;

	public FormBranchStatsRecord[] getStats() {
		return stats;
	}

	public void setStats(FormBranchStatsRecord[] stats) {
		this.stats = stats;
	}
	
	
}
