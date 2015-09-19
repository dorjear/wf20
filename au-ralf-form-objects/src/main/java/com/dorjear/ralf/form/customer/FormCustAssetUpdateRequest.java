package com.dorjear.ralf.form.customer;

import com.dorjear.ralf.form.FormAsset;
import com.dorjear.ralf.form.FormCustBaseReq;

public class FormCustAssetUpdateRequest extends FormCustBaseReq {
	private FormAsset asset;

	public FormAsset getAsset() {
		return asset;
	}
	public void setAsset(FormAsset asset) {
		this.asset = asset;
	}

	

}
