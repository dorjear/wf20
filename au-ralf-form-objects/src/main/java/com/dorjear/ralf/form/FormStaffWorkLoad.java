package com.dorjear.ralf.form;

public class FormStaffWorkLoad {

	private String staff;
	private String firstName;
	private String middleName;
	private String lastName;
	private int allocatedCount;
	private int capacity;
	public String getStaff() {
		return staff;
	}
	public void setStaff(String staff) {
		this.staff = staff;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAllocatedCount() {
		return allocatedCount;
	}
	public void setAllocatedCount(int allocatedCount) {
		this.allocatedCount = allocatedCount;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
}
