package com.example.REST.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class innojc_table{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String NAME;
	private int AGE;
	private String AADHAR_NO;
	private String MOBILE_NO;
	private String ADDRESS;
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public int getAGE() {
		return AGE;
	}
	public void setAGE(int aGE) {
		AGE = aGE;
	}
	public String getAADHAR_NO() {
		return AADHAR_NO;
	}
	public void setAADHAR_NO(String aADHAR_NO) {
		AADHAR_NO = aADHAR_NO;
	}
	public String getMOBILE_NO() {
		return MOBILE_NO;
	}
	public void setMOBILE_NO(String mOBILE_NO) {
		MOBILE_NO = mOBILE_NO;
	}
	public String getADDRESS() {
		return ADDRESS;
	}
	public void setADDRESS(String aDDRESS) {
		ADDRESS = aDDRESS;
	}
	public innojc_table(String nAME, int aGE, String aADHAR_NO, String mOBILE_NO, String aDDRESS) {
		super();
		NAME = nAME;
		AGE = aGE;
		AADHAR_NO = aADHAR_NO;
		MOBILE_NO = mOBILE_NO;
		ADDRESS = aDDRESS;
	}
	public innojc_table() {
		super();
		
	}
	

}
