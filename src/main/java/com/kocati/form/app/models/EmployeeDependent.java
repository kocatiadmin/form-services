package com.kocati.form.app.models;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.kocati.form.app.models.enums.GenderType;
import com.kocati.form.app.models.enums.RelationType;

@Entity
public class EmployeeDependent implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "dependentId")
	private Long id;
	
	private Long dependentSsn;
	
	@Enumerated(EnumType.STRING)
	private RelationType relation;
	
	private String firstName;
	private String lastName;
	private String middleInitial;
	
	@Enumerated(EnumType.STRING)
	private GenderType gender;
	
	@Temporal(TemporalType.DATE)
	private Date dob;
	
	private int height;
	private double weight;
	private boolean isUsingTobacco;
	private boolean isTwin;
	
	@OneToMany(mappedBy = "enrolledUser")
    Set<EmployeePolicy> policies;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getDependentSsn() {
		return dependentSsn;
	}
	public void setDependentSsn(Long dependentSsn) {
		this.dependentSsn = dependentSsn;
	}
	public RelationType getRelation() {
		return relation;
	}
	public void setRelation(RelationType relation) {
		this.relation = relation;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMiddleInitial() {
		return middleInitial;
	}
	public void setMiddleInitial(String middleInitial) {
		this.middleInitial = middleInitial;
	}
	public GenderType getGender() {
		return gender;
	}
	public void setGender(GenderType gender) {
		this.gender = gender;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public boolean isUsingTobacco() {
		return isUsingTobacco;
	}
	public void setUsingTobacco(boolean isUsingTobacco) {
		this.isUsingTobacco = isUsingTobacco;
	}
	public boolean isTwin() {
		return isTwin;
	}
	public void setTwin(boolean isTwin) {
		this.isTwin = isTwin;
	}
	public Set<EmployeePolicy> getPolicies() {
		return policies;
	}
	public void setPolicies(Set<EmployeePolicy> policies) {
		this.policies = policies;
	}
}
