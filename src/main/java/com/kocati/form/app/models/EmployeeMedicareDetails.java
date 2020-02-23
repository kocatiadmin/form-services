package com.kocati.form.app.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class EmployeeMedicareDetails implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	private String eligibilityReason;
	private String ineligibilityReason;
	private String coverageCode;
	
	@Temporal(TemporalType.DATE)
	private Date startDatePartA;
	
	@Temporal(TemporalType.DATE)
	private Date endDatePartA;
	
	@Temporal(TemporalType.DATE)
	private Date startDatePartB;
	
	@Temporal(TemporalType.DATE)
	private Date endDatePartB;
	
	@Temporal(TemporalType.DATE)
	private Date startDatePartD;
	
	@Temporal(TemporalType.DATE)
	private Date endDatePartD;
	
	@OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "policy_id", nullable = false)
	private EmployeePolicy policy;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEligibilityReason() {
		return eligibilityReason;
	}

	public void setEligibilityReason(String eligibilityReason) {
		this.eligibilityReason = eligibilityReason;
	}

	public String getIneligibilityReason() {
		return ineligibilityReason;
	}

	public void setIneligibilityReason(String ineligibilityReason) {
		this.ineligibilityReason = ineligibilityReason;
	}

	public String getCoverageCode() {
		return coverageCode;
	}

	public void setCoverageCode(String coverageCode) {
		this.coverageCode = coverageCode;
	}

	public Date getStartDatePartA() {
		return startDatePartA;
	}

	public void setStartDatePartA(Date startDatePartA) {
		this.startDatePartA = startDatePartA;
	}

	public Date getEndDatePartA() {
		return endDatePartA;
	}

	public void setEndDatePartA(Date endDatePartA) {
		this.endDatePartA = endDatePartA;
	}

	public Date getStartDatePartB() {
		return startDatePartB;
	}

	public void setStartDatePartB(Date startDatePartB) {
		this.startDatePartB = startDatePartB;
	}

	public Date getEndDatePartB() {
		return endDatePartB;
	}

	public void setEndDatePartB(Date endDatePartB) {
		this.endDatePartB = endDatePartB;
	}

	public Date getStartDatePartD() {
		return startDatePartD;
	}

	public void setStartDatePartD(Date startDatePartD) {
		this.startDatePartD = startDatePartD;
	}

	public Date getEndDatePartD() {
		return endDatePartD;
	}

	public void setEndDatePartD(Date endDatePartD) {
		this.endDatePartD = endDatePartD;
	}

	public EmployeePolicy getPolicy() {
		return policy;
	}

	public void setPolicy(EmployeePolicy policy) {
		this.policy = policy;
	}

}
