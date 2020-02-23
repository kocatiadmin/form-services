package com.kocati.form.app.models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Employee implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "employeeId")
	private Long id;
	
    private Long employeeSsn;    
    private String emailId;
    private String homePhoneNo;
    private String workPhoneNo;
    private String street;
    private String city;
    private String State;
    private String zipCode;
    
    @Temporal(TemporalType.DATE)
    private Date hireDate;
    
    @Temporal(TemporalType.DATE)
    private Date coverageEffectiveDate;
    
    @Temporal(TemporalType.DATE)
    private Date cobraBeginDate;
    
    @Temporal(TemporalType.DATE)
    private Date cobraEndDate;
    
    @Temporal(TemporalType.DATE)
    private Date retireDate;
    
	private double employeeSalary;
	private double hoursWorked;
    
    @OneToMany(cascade = CascadeType.ALL )
    @JoinColumn(name = "employeeId")
    private List<EmployeeDependent> dependentsList;    

    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getEmployeeSsn() {
		return employeeSsn;
	}
	public void setEmployeeSsn(Long employeeSsn) {
		this.employeeSsn = employeeSsn;
	}
	public List<EmployeeDependent> getDependentsList() {
		return dependentsList;
	}
	public void setDependentsList(List<EmployeeDependent> dependentsList) {
		this.dependentsList = dependentsList;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getHomePhoneNo() {
		return homePhoneNo;
	}
	public void setHomePhoneNo(String homePhoneNo) {
		this.homePhoneNo = homePhoneNo;
	}
	public String getWorkPhoneNo() {
		return workPhoneNo;
	}
	public void setWorkPhoneNo(String workPhoneNo) {
		this.workPhoneNo = workPhoneNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public Date getCoverageEffectiveDate() {
		return coverageEffectiveDate;
	}
	public void setCoverageEffectiveDate(Date coverageEffectiveDate) {
		this.coverageEffectiveDate = coverageEffectiveDate;
	}
	public Date getCobraBeginDate() {
		return cobraBeginDate;
	}
	public void setCobraBeginDate(Date cobraBeginDate) {
		this.cobraBeginDate = cobraBeginDate;
	}
	public Date getCobraEndDate() {
		return cobraEndDate;
	}
	public void setCobraEndDate(Date cobraEndDate) {
		this.cobraEndDate = cobraEndDate;
	}
	public Date getRetireDate() {
		return retireDate;
	}
	public void setRetireDate(Date retireDate) {
		this.retireDate = retireDate;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public double getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

}
