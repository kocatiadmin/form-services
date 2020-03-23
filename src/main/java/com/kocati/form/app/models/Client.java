package com.kocati.form.app.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Client implements Serializable {
	
	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "clientId")
    private Long id;
    
    private String name;    
    private String taxId;    
    private String phoneNo;    
    private String emailId;    
    private String website;    
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "clientId")
    private List<ClientContactDetails> contactDetailsList;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "clientId")
    private List<Employee> employeeList;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "clientId")
    private List<ClientPolicyBucket> policyBuckets;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTaxId() {
		return taxId;
	}

	public void setTaxId(String taxId) {
		this.taxId = taxId;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public List<ClientContactDetails> getContactDetailsList() {
		return contactDetailsList;
	}

	public void setContactDetailsList(List<ClientContactDetails> contactDetailsList) {
		this.contactDetailsList = contactDetailsList;
	}

	public List<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}

	public List<ClientPolicyBucket> getPolicyBuckets() {
		return policyBuckets;
	}

	public void setPolicyBuckets(List<ClientPolicyBucket> policyBuckets) {
		this.policyBuckets = policyBuckets;
	}
}