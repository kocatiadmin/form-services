package com.kocati.form.app.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.kocati.form.app.models.enums.PolicyType;

@Entity
public class PolicyBucket implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "bucketId")
	private Long id;
	
	@Enumerated(EnumType.STRING)
	private PolicyType policyType;
	
	private String carrier;
	private String network;
	
	@Temporal(TemporalType.DATE)
	private Date effectiveDate;
	
	@Temporal(TemporalType.DATE)
	private Date terminationDate;

	private double premium;
	private double commissions;
	private String endorsements;
	private String planDetails;
	private String funding;
	private int startLimit;
	private int endLimit;
	private int propertyCoverage;
	private int autoLiability;
	private Boolean isActive;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public PolicyType getPolicyType() {
		return policyType;
	}
	public void setPolicyType(PolicyType policyType) {
		this.policyType = policyType;
	}
	public String getCarrier() {
		return carrier;
	}
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	public String getNetwork() {
		return network;
	}
	public void setNetwork(String network) {
		this.network = network;
	}
	public Date getEffectiveDate() {
		return effectiveDate;
	}
	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	public double getPremium() {
		return premium;
	}
	public void setPremium(double premium) {
		this.premium = premium;
	}
	public double getCommissions() {
		return commissions;
	}
	public void setCommissions(double commissions) {
		this.commissions = commissions;
	}
	public String getEndorsements() {
		return endorsements;
	}
	public void setEndorsements(String endorsements) {
		this.endorsements = endorsements;
	}
	public String getPlanDetails() {
		return planDetails;
	}
	public void setPlanDetails(String planDetails) {
		this.planDetails = planDetails;
	}
	public String getFunding() {
		return funding;
	}
	public void setFunding(String funding) {
		this.funding = funding;
	}
	public int getStartLimit() {
		return startLimit;
	}
	public void setStartLimit(int startLimit) {
		this.startLimit = startLimit;
	}
	public int getEndLimit() {
		return endLimit;
	}
	public void setEndLimit(int endLimit) {
		this.endLimit = endLimit;
	}
	public int getPropertyCoverage() {
		return propertyCoverage;
	}
	public void setPropertyCoverage(int propertyCoverage) {
		this.propertyCoverage = propertyCoverage;
	}
	public int getAutoLiability() {
		return autoLiability;
	}
	public void setAutoLiability(int autoLiability) {
		this.autoLiability = autoLiability;
	}
	public Date getTerminationDate() {
		return terminationDate;
	}
	public void setTerminationDate(Date terminationDate) {
		this.terminationDate = terminationDate;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	
}
