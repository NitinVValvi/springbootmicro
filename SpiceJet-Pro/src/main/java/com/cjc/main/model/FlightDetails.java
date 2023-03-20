package com.cjc.main.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class FlightDetails {

	private int flight_no;
	private String flight_name;
	private String f_source;
	private String f_destination;
	@JsonFormat (pattern = "yyyy-MM-dd hh:mm:ss")
	private Date f_date_time =  new Date();
	
	private int flightduration_min;

	public int getFlight_no() {
		return flight_no;
	}

	public void setFlight_no(int flight_no) {
		this.flight_no = flight_no;
	}

	public String getFlight_name() {
		return flight_name;
	}

	public void setFlight_name(String flight_name) {
		this.flight_name = flight_name;
	}

	public String getF_source() {
		return f_source;
	}

	public void setF_source(String f_source) {
		this.f_source = f_source;
	}

	public String getF_destination() {
		return f_destination;
	}

	public void setF_destination(String f_destination) {
		this.f_destination = f_destination;
	}

	public Date getF_date_time() {
		return f_date_time;
	}

	public void setF_date_time(Date f_date_time) {
		this.f_date_time = f_date_time;
	}

	public int getFlightduration_min() {
		return flightduration_min;
	}

	public void setFlightduration_min(int flightduration_min) {
		this.flightduration_min = flightduration_min;
	}
	
}
