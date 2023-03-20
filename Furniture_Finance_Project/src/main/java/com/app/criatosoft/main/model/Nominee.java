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
public class Nominee {
	@Id
	private int nomid;
	private String nomName;
	private String nomRelation;
	private String nomDob;
	private int nomAge;
}
