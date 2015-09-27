package com.dorjear.ralf.db.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="TB_RALF_APPLICATION")
public class TbRalfApplication {

	@Id
	@Column(name = "application_id", nullable = false, length=30)
	private String applicationId;
	
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

	@Column(name = "app_attribute", nullable = true)
	@Lob
	private String appAttribute;

	@Column(name = "applicant", nullable = true)
	@Lob
	private String applicant;
	
	@Column(name = "partner", nullable = true)
	@Lob
	private String partner;
	
	@Column(name = "hub_decision", nullable = true)
	@Lob
	private String hubDecision;
	
	@Column(name = "maps_decision", nullable = true)
	@Lob
	private String mapsDecision;
	
	@Column(name = "evid_result", nullable = true)
	@Lob
	private String evidResult;
	
}
