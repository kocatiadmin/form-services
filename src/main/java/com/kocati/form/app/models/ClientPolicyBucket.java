package com.kocati.form.app.models;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class ClientPolicyBucket implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	@Column(name = "clientBucketId")
	private ClientPolicyBucketPK id;
	
	@Temporal(TemporalType.DATE)
	private Date effectiveDate;
	
	@Temporal(TemporalType.DATE)
	private Date terminationDate;
	
	@OneToMany(mappedBy = "enrolledPolicy") 
	Set<EmployeePolicy> policies;
	 
	
	private Boolean isActive;

	public ClientPolicyBucketPK getId() {
		return id;
	}

	public void setId(ClientPolicyBucketPK id) {
		this.id = id;
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

	public Set<EmployeePolicy> getPolicies() {
		return policies;
	}

	public void setPolicies(Set<EmployeePolicy> policies) {
		this.policies = policies;
	}

	/*
	 * public Set<EmployeePolicies> getEmployeePolicies() { return employeePolicies;
	 * }
	 * 
	 * public void setEmployeePolicies(Set<EmployeePolicies> employeePolicies) {
	 * this.employeePolicies = employeePolicies; }
	 */

}
