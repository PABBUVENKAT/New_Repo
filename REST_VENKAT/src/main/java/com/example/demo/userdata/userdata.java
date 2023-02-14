package com.example.demo.userdata;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class userdata {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String NAME;
	private int AGE;
	private long AADHAR_NO;
	private long MOBILE_NO;
	private String ADDRESS;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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

	public long getAADHAR_NO() {
		return AADHAR_NO;
	}

	public void setAADHAR_NO(long aADHAR_NO) {
		AADHAR_NO = aADHAR_NO;
	}

	public long getMOBILE_NO() {
		return MOBILE_NO;
	}

	public void setMOBILE_NO(long mOBILE_NO) {
		MOBILE_NO = mOBILE_NO;
	}

	public String getADDRESS() {
		return ADDRESS;
	}

	public void setADDRESS(String aDDRESS) {
		ADDRESS = aDDRESS;
	}

	public userdata(long id, String nAME, int aGE, long aADHAR_NO, long mOBILE_NO, String aDDRESS) {
		super();
		this.id = id;
		this.NAME = nAME;
		this.AGE = aGE;
		this.AADHAR_NO = aADHAR_NO;
		this.MOBILE_NO = mOBILE_NO;
		this.ADDRESS = aDDRESS;
	}

	@Override
	public String toString() {
		return "userdata [id=" + id + ", NAME=" + NAME + ", AGE=" + AGE + ", AADHAR_NO=" + AADHAR_NO + ", MOBILE_NO="
				+ MOBILE_NO + ", ADDRESS=" + ADDRESS + "]";
	}

	public userdata() {
		super();
		// TODO Auto-generated constructor stub
	}

}