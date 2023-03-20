package com.cjc.main.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.FlightDetails;

@RestController
public class HomeController {

	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping("/getairindia")
	public List flightavail()
	{
		FlightDetails flight1 = new FlightDetails();
		flight1.setFlight_no(11900);
		flight1.setFlight_name("AirIndia");
		flight1.setF_source("Pune");
		flight1.setF_destination("Mumbai");
		flight1.setF_date_time(null);
		flight1.setFlightduration_min(120);
		FlightDetails flight2 = new FlightDetails();
		flight2.setFlight_no(11910);
		flight2.setFlight_name("AirIndia");
		flight2.setF_source("Pune");
		flight2.setF_destination("Delhi");
		flight2.setF_date_time(null);
		flight2.setFlightduration_min(140);
		List li =new ArrayList();
		li.add(flight1);
		li.add(flight2);
		return li;
	}

	
}
