package com.dorjear.ralf.db.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="TB_RALF_CUSTOMER")
public class TbRalfCustomer {

	@Id
	@Column(name = "customer_id", nullable = false, length=30)
	private String customerId;
	
	@Column(name = "first_name", nullable = true, length=30)
	private String firstName;

	@Column(name = "middle_name", nullable = true, length=30)
	private String middleName;

	@Column(name = "last_name", nullable = true, length=30)
	private String lastName;

	@Column(name = "date_of_birth", nullable = true, length=30)
	private Date dateOfBirth;
	
	@Column(name = "create_date", nullable = true)
	private Date createDate;
	
	@Column(name = "last_update_date", nullable = true)
	private Date lastUpdateDate;

	@Column(name = "detail", nullable = true)
	@Lob
	private String detail;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
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

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}



}
