package com.dorjear.ralf.form;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

public class FormCustContactPref {
	
	private Long ralfCustomerId;
	private String preferChannel;
	private Boolean urgent;
	private String timeSlot;
	private String appointmentBranch;
	private String appointmentDate;
	private String appointmentTime;
	
	public Long getRalfCustomerId() {
		return ralfCustomerId;
	}
	public void setRalfCustomerId(Long ralfCustomerId) {
		this.ralfCustomerId = ralfCustomerId;
	}
	public String getPreferChannel() {
		return preferChannel;
	}
	public void setPreferChannel(String preferChannel) {
		this.preferChannel = preferChannel;
	}
	public Boolean getUrgent() {
		return urgent;
	}
	public void setUrgent(Boolean urgent) {
		this.urgent = urgent;
	}
	public String getTimeSlot() {
		return timeSlot;
	}
	public void setTimeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
	}
	public String getAppointmentBranch() {
		return appointmentBranch;
	}
	public void setAppointmentBranch(String appointmentBranch) {
		this.appointmentBranch = appointmentBranch;
	}
	public String getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	public String getAppointmentTime() {
		return appointmentTime;
	}
	public void setAppointmentTime(String appointmentTime) {
		this.appointmentTime = appointmentTime;
	}
	
}
