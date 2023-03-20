package com.app.criatosoft.main.model;

import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Address {
	@Id
	private int addrid;
	private String areaName;
	private String cityName;
	private String stateName;
	private int pinCode;
}
