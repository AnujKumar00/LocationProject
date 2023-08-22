package com.anujkumar.LocationProject.modals;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

//Simple Pojo Class
@Builder
public class UserLocationData {
	private String name;
	private double lat;
	private double longi;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLongi() {
		return longi;
	}
	public void setLongi(double longi) {
		this.longi = longi;
	}
}
