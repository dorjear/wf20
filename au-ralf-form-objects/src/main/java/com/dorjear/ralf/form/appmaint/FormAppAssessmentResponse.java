package com.dorjear.ralf.form.appmaint;

import com.dorjear.ralf.form.base.FormResponseBase;

public class FormAppAssessmentResponse extends FormResponseBase{
	private Integer assessment;
	
	public Integer getAssessment(){
		return assessment;
	}
	
	public void setAssessment(Integer assessment){
		this.assessment = assessment;
	}
}
