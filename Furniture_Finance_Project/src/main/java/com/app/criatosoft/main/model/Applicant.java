package com.app.criatosoft.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@Entity
public class Applicant {
	private String applicantId;
	private String applicantFname;
	private String applicantLname;
	private String applicantMobileno;
	private String applicantEmailId;
	private String applicantDob;
	private String applicantOccupation;
	private String applicantAadharno;
	private String applicantPanno;
	private long applicantLoanamt;
	private String status;
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;
	@OneToOne(cascade = CascadeType.ALL)
	private Document document;
	@OneToOne(cascade = CascadeType.ALL)
	private BankDetails bankdetails;
	@OneToOne(cascade = CascadeType.ALL)
	private Nominee nominee;
	@OneToOne(cascade = CascadeType.ALL)
	private Guarantor guarantor;
}
