package com.kocati.form.app.models.enums;

public enum PolicyType {
	
	HEALTH ("HE"),
	DENTAL ("DE"),
	VISION ("VI"),
	LIFE_ADD ("LA"),
	STD ("ST"),
	LTD ("LT"),
	OTHER ("OT"),
	MEDICARE ("ME"),
	CGL_BOP ("CB"),
	WORKER_COMPENSATION ("WC"),
	UMBRELLA ("UM"),
	OMMISSIONS ("OM"),
	CRIME_BOND ("CR"),
	COMMERCIAL_AUTO ("CA");

	private final String policyCode;
	
	PolicyType(String policy) {
		this.policyCode = policy;
	}
	
	public String getPolicyCode() {
		return this.policyCode;
	}

}
