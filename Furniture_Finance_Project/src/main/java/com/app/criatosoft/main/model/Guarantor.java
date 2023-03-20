package com.app.criatosoft.main.model;

import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Guarantor {
	@Id
	private int guarantorId;
	private String guarantorName;
	private String guarantorMobileno;
	private String guarantorOccupation;
}
