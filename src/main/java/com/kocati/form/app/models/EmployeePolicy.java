package com.kocati.form.app.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class EmployeePolicy implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "policyId")
    private Long id;
	
	@ManyToOne
    @MapsId("clientBucketId")
	@JoinColumns({
	  @JoinColumn(name = "clientId"),
	  @JoinColumn(name = "policyBucketId")
	})
	private ClientPolicyBucket enrolledPolicy;
	
	@ManyToOne
    @MapsId("dependentId")
    @JoinColumn(name = "dependentId")
	private EmployeeDependent enrolledUser;

	@Temporal(TemporalType.DATE)
	private Date effectiveDate;
	
	@Temporal(TemporalType.DATE)
	private Date terminationDate;
	
	@OneToOne(fetch = FetchType.EAGER,
            cascade =  CascadeType.ALL,
            mappedBy = "policy")
	private EmployeePolicyDetails policyDetails;
	
	@OneToOne(fetch = FetchType.EAGER,
            cascade =  CascadeType.ALL,
            mappedBy = "policy")
	private EmployeeMedicareDetails medicareDetails;
	
	@OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL,
            mappedBy = "policy")
	private PolicyInternalUseInfo internalUseInfo;
	
	private Boolean isActive;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ClientPolicyBucket getEnrolledPolicy() {
		return enrolledPolicy;
	}

	public void setEnrolledPolicy(ClientPolicyBucket enrolledPolicy) {
		this.enrolledPolicy = enrolledPolicy;
	}

	public EmployeeDependent getEnrolledUser() {
		return enrolledUser;
	}

	public void setEnrolledUser(EmployeeDependent enrolledUser) {
		this.enrolledUser = enrolledUser;
	}

	public Date getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
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

	public EmployeePolicyDetails getPolicyDetails() {
		return policyDetails;
	}

	public void setPolicyDetails(EmployeePolicyDetails policyDetails) {
		this.policyDetails = policyDetails;
	}

	public EmployeeMedicareDetails getMedicareDetails() {
		return medicareDetails;
	}

	public void setMedicareDetails(EmployeeMedicareDetails medicareDetails) {
		this.medicareDetails = medicareDetails;
	}

	public PolicyInternalUseInfo getInternalUseInfo() {
		return internalUseInfo;
	}

	public void setInternalUseInfo(PolicyInternalUseInfo internalUseInfo) {
		this.internalUseInfo = internalUseInfo;
	}

}
