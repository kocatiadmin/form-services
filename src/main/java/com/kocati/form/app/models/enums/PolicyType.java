package com.kocati.form.app.models.enums;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum PolicyType {
	HEALTH("HE"), DENTAL("DE"), VISION("VI"), LIFE_ADD("LA"), STD("ST"), LTD("LT"), OTHER("OT"), MEDICARE("ME"),
	CGL_BOP("CB"), WORKER_COMPENSATION("WC"), UMBRELLA("UM"), OMMISSIONS("OM"), CRIME_BOND("CR"), COMMERCIAL_AUTO("CA");

	private static Map<String, PolicyType> FORMAT_MAP = Stream.of(PolicyType.values())
			.collect(Collectors.toMap(s -> s.formatted, Function.identity()));

	private final String formatted;

	PolicyType(String formatted) {
		this.formatted = formatted;
	}

	@JsonCreator // This is the factory method and must be static
	public static PolicyType fromString(String string) {
		return Optional.ofNullable(FORMAT_MAP.get(string)).orElseThrow(() -> new IllegalArgumentException(string));
	}

}
