package com.anujkumar.LocationProject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.anujkumar.LocationProject.adaptars.UserLocationDataAdapter;
import com.anujkumar.LocationProject.modals.UserLocationData;

@RestController
public class LocationDataController {
	
//	@Autowired
//	private UserLocationDataAdapter adapter;
	
	@GetMapping("/home")
	public String getBaseResponse(){
		String msgString = "controller is working";
//		return new ResponseEntity<String>(msgString, HttpStatus.OK);
		return msgString;
	}
	
	@GetMapping("/get_users/{N}")
	public UserLocationData getUserLocations(@PathVariable int N) {
		return UserLocationDataAdapter.getData();
	}
	
}
