package com.dorjear.ralf.form.dashboard;

import com.dorjear.ralf.form.FormRegionalStatsRecord;
import com.dorjear.ralf.form.base.FormResponseBase;

public class FormRegionalAppLeadDashboardResponse extends FormResponseBase {
	private FormRegionalStatsRecord[] stats;

	public FormRegionalStatsRecord[] getStats() {
		return stats;
	}

	public void setStats(FormRegionalStatsRecord[] stats) {
		this.stats = stats;
	}
	
	
}
