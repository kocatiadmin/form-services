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
public class EmployeePolicyDetails implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	private boolean coverageOpted;
	private int coverageAmount;
	private String planNumber;
	private String primaryCare;
	private String occupationalClass;
	private int priorCarrierAmount;
	private boolean stdLtdBuyUp;
	
	@Temporal(TemporalType.DATE)
	private Date cobBeginDate;
	
	@Temporal(TemporalType.DATE)
	private Date cobEndDate;
	
	private boolean aoCoverageOpted;
	
	@OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "policy_id", nullable = false)
	private EmployeePolicy policy;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean isCoverageOpted() {
		return coverageOpted;
	}

	public void setCoverageOpted(boolean coverageOpted) {
		this.coverageOpted = coverageOpted;
	}

	public int getCoverageAmount() {
		return coverageAmount;
	}

	public void setCoverageAmount(int coverageAmount) {
		this.coverageAmount = coverageAmount;
	}

	public String getPlanNumber() {
		return planNumber;
	}

	public void setPlanNumber(String planNumber) {
		this.planNumber = planNumber;
	}

	public String getPrimaryCare() {
		return primaryCare;
	}

	public void setPrimaryCare(String primaryCare) {
		this.primaryCare = primaryCare;
	}

	public String getOccupationalClass() {
		return occupationalClass;
	}

	public void setOccupationalClass(String occupationalClass) {
		this.occupationalClass = occupationalClass;
	}

	public int getPriorCarrierAmount() {
		return priorCarrierAmount;
	}

	public void setPriorCarrierAmount(int priorCarrierAmount) {
		this.priorCarrierAmount = priorCarrierAmount;
	}

	public boolean isStdLtdBuyUp() {
		return stdLtdBuyUp;
	}

	public void setStdLtdBuyUp(boolean stdLtdBuyUp) {
		this.stdLtdBuyUp = stdLtdBuyUp;
	}

	public Date getCobBeginDate() {
		return cobBeginDate;
	}

	public void setCobBeginDate(Date cobBeginDate) {
		this.cobBeginDate = cobBeginDate;
	}

	public Date getCobEndDate() {
		return cobEndDate;
	}

	public void setCobEndDate(Date cobEndDate) {
		this.cobEndDate = cobEndDate;
	}

	public boolean isAoCoverageOpted() {
		return aoCoverageOpted;
	}

	public void setAoCoverageOpted(boolean aoCoverageOpted) {
		this.aoCoverageOpted = aoCoverageOpted;
	}

	public EmployeePolicy getPolicy() {
		return policy;
	}

	public void setPolicy(EmployeePolicy policy) {
		this.policy = policy;
	}

}
