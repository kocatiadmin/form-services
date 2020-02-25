package com.kocati.form.app.models.enums;

public enum RelationType {
	EMPLOYEE ("EE"), 
	SPOUSE ("SP"), 
	CHILD ("CH"), 
	WAIVER ("WV"), 
	STUDENT ("ST"), 
	COBRA ("CB"), 
	DOMESTICPARTNER ("DP"),
	MENTALLYHANDICAPPED ("HM"), 
	PHYSICALLYHANDICAPPED ("HP"), 
	MEDICARE ("MC"), 
	RETIRED ("RR"), 
	SURVIVINGSPOUSE ("SS");

	private final String relationCode;
	
	RelationType(String relation) {
		this.relationCode = relation;
	}
	
	public String getRelationCode() {
		return this.relationCode;
	}
}
