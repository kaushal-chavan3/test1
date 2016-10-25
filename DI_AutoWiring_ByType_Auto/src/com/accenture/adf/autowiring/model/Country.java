package com.accenture.adf.autowiring.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Country {

	private String name;
	@Autowired
	private Capital capital;
	@Autowired
	private State state;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Capital getCapital() {
		return capital;
	}
	public void setCapital(Capital capital) {
		this.capital = capital;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
}
