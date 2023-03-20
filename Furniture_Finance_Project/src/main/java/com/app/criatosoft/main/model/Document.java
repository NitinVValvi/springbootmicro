package com.app.criatosoft.main.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Document {
	private int docId;
	private byte[] aadharCard;
	private byte[] panCard;
	private byte[] cancelledCheque;
	private byte[] passbook;
	private byte[] signature;
	private byte[] photo;
	private byte[] quotation;
}
