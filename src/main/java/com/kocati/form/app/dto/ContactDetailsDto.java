package com.kocati.form.app.dto;

import java.io.Serializable;

import com.kocati.form.app.models.ClientContactDetails;

public class ContactDetailsDto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String name;	
	private String phoneNo;	
	private String emailId;	
	private String designation;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public static ClientContactDetails fromDto(ContactDetailsDto contactDetailsDto) {
		ClientContactDetails clientContactDetails = new ClientContactDetails();
		clientContactDetails.setName(contactDetailsDto.getName());
		clientContactDetails.setPhoneNo(contactDetailsDto.getPhoneNo());
		clientContactDetails.setEmailId(contactDetailsDto.getEmailId());
		clientContactDetails.setDesignation(contactDetailsDto.getDesignation());
		return clientContactDetails;
	}

}
