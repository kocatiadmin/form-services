package com.kocati.form.app.models.enums;

public enum GenderType {
	MALE ("M"),
	FEMALE ("F"),
	OTHER ("O");

	private final String genderCode;
	
	GenderType(String gender) {
		this.genderCode = gender;
	}
	
	public String getGenderCode() {
		return this.genderCode;
	}
}
