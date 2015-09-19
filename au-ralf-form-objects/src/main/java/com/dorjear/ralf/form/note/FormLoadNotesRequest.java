package com.dorjear.ralf.form.note;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import com.dorjear.ralf.form.base.FormRequestBase;

public class FormLoadNotesRequest extends FormRequestBase {

	@NotBlank
	@Size(min = 5, max = 30)
	private String targetId;
	
	@Pattern(regexp = "^$|A|L|C")
	private String targetType;
	
	@Pattern(regexp = "^$|M|P")
	private String applicantType;
	
	public String getTargetId() {
		return targetId;
	}
	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}
	public String getTargetType() {
		return targetType;
	}
	public void setTargetType(String targetType) {
		this.targetType = targetType;
	}
	public String getApplicantType() {
		return applicantType;
	}
	public void setApplicantType(String applicantType) {
		this.applicantType = applicantType;
	}
	
	
}
