package com.anujkumar.LocationProject.adaptars;

import com.anujkumar.LocationProject.modals.UserLocationData;

public class UserLocationDataAdapter {
	
	public static UserLocationData getData() {
		UserLocationData userLocationData = new UserLocationData();
		userLocationData.setName("Anuj Anshu");
		userLocationData.setLat(76.0088923);
		userLocationData.setLongi(75.8989808);
		return userLocationData;
	}
}
