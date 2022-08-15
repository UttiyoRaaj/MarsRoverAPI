package com.utydevs.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MarsRover {

	private Long id;
	private String name;
	@JsonProperty("launching_date")
	private String launchingDate;
	@JsonProperty("launch_date")
	private String launchDate;
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
	public String getLaunchingDate() {
		return launchingDate;
	}
	public void setLaunchingDate(String launchingDate) {
		this.launchingDate = launchingDate;
	}
	public String getLaunchDate() {
		return launchDate;
	}
	public void setLaunchDate(String launchDate) {
		this.launchDate = launchDate;
	}
}
