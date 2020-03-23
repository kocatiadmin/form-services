package com.kocati.form.app.dto;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

import com.kocati.form.app.models.Client;

public class ClientDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private String taxId;
	private String phoneNo;
	private String email;
	private String website;
	private String streetAddress;
	private String city;
	private String state;
	private String zipCode;
	private List<ContactDetailsDto> contactDetailsList;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public List<ContactDetailsDto> getContactDetailsList() {
		return contactDetailsList;
	}

	public void setContactDetailsList(List<ContactDetailsDto> contactDetailsList) {
		this.contactDetailsList = contactDetailsList;
	}

	public static Client fromDto(ClientDto clientDto) {
		Client client = new Client();
		client.setName(clientDto.getName());
		client.setTaxId(clientDto.getTaxId());
		client.setEmailId(clientDto.getEmail());
		client.setPhoneNo(clientDto.getPhoneNo());
		client.setWebsite(clientDto.getWebsite());
		client.setStreetAddress(clientDto.getStreetAddress());
		client.setCity(clientDto.getCity());
		client.setState(clientDto.getState());
		client.setZipCode(clientDto.getZipCode());

		client.setContactDetailsList(clientDto.getContactDetailsList().stream().map(ContactDetailsDto::fromDto)
				.collect(Collectors.toList()));

		return client;
	}
}
