package com.kocati.form.app.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class PolicyInternalUseInfo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	private String rvSuperGroup;
	private String rvClassId;
	private String rvSubGroup;
	private String medNetwork;
	private String medProduct;
	private String nhpGroupNumber;
	private boolean onPriorCarrier;
	private boolean hsaApplicationReceived;
	private String medicalWaiverReason;
	private String healthTransfer;
	private String covered;
	private String policyNumber;
	
	@OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "policy_id", nullable = false)
	private EmployeePolicy policy;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRvSuperGroup() {
		return rvSuperGroup;
	}
	public void setRvSuperGroup(String rvSuperGroup) {
		this.rvSuperGroup = rvSuperGroup;
	}
	public String getRvClassId() {
		return rvClassId;
	}
	public void setRvClassId(String rvClassId) {
		this.rvClassId = rvClassId;
	}
	public String getRvSubGroup() {
		return rvSubGroup;
	}
	public void setRvSubGroup(String rvSubGroup) {
		this.rvSubGroup = rvSubGroup;
	}
	public String getMedNetwork() {
		return medNetwork;
	}
	public void setMedNetwork(String medNetwork) {
		this.medNetwork = medNetwork;
	}
	public String getMedProduct() {
		return medProduct;
	}
	public void setMedProduct(String medProduct) {
		this.medProduct = medProduct;
	}
	public String getNhpGroupNumber() {
		return nhpGroupNumber;
	}
	public void setNhpGroupNumber(String nhpGroupNumber) {
		this.nhpGroupNumber = nhpGroupNumber;
	}
	public boolean isOnPriorCarrier() {
		return onPriorCarrier;
	}
	public void setOnPriorCarrier(boolean onPriorCarrier) {
		this.onPriorCarrier = onPriorCarrier;
	}
	public boolean isHsaApplicationReceived() {
		return hsaApplicationReceived;
	}
	public void setHsaApplicationReceived(boolean hsaApplicationReceived) {
		this.hsaApplicationReceived = hsaApplicationReceived;
	}
	public String getMedicalWaiverReason() {
		return medicalWaiverReason;
	}
	public void setMedicalWaiverReason(String medicalWaiverReason) {
		this.medicalWaiverReason = medicalWaiverReason;
	}
	public String getHealthTransfer() {
		return healthTransfer;
	}
	public void setHealthTransfer(String healthTransfer) {
		this.healthTransfer = healthTransfer;
	}
	public String getCovered() {
		return covered;
	}
	public void setCovered(String covered) {
		this.covered = covered;
	}
	public String getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	public EmployeePolicy getPolicy() {
		return policy;
	}

	public void setPolicy(EmployeePolicy policy) {
		this.policy = policy;
	}

}
