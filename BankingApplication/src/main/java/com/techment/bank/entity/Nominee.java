package com.techment.bank.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="nominee")

public class Nominee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)


	private int nomineeId;
	private String name;
	private String govtId;
	private enum govtIdType{AdharCard , PANCard};
	private String phoneNo;
	private enum Relation{Father,Mother,Husband,Wife};
	
	
	public Nominee() {
		super();
	}

	public Nominee(int nomineeId, String name, String govtId, String phoneNo) {
		super();
		this.nomineeId = nomineeId;
		this.name = name;
		this.govtId = govtId;
		this.phoneNo = phoneNo;
	}
	
	public int getNomineeId() {
		return nomineeId;
	}
	public void setNomineeId(int nomineeId) {
		this.nomineeId = nomineeId;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGovtId() {
		return govtId;
	}
	public void setGovtId(String govtId) {
		this.govtId = govtId;
	}
	
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
		

}
