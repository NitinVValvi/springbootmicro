package com.app.criatosoft.main.model;

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
public class BankDetails {
	private int bankId;
	private String bankName;
	private String bankBranchname;
	private String bankAccountno;
	private String bankIfsccode;
	private String bankAddress;
}
