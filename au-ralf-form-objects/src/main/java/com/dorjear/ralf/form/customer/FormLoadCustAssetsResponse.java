package com.dorjear.ralf.form.customer;

import com.dorjear.ralf.form.FormAsset;
import com.dorjear.ralf.form.base.FormResponseBase;

public class FormLoadCustAssetsResponse extends FormResponseBase {
	private FormAsset[] assets = new FormAsset[0];

	public FormAsset[] getAssets() {
		return assets;
	}

	public void setAssets(FormAsset[] assets) {
		this.assets = assets;
	}


}
