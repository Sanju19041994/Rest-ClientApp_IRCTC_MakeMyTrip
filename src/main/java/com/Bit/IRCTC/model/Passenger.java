package com.Bit.IRCTC.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Passenger {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pId;
	
	private String fName;
	
	private String lName;
	
	private String jFrom;
	
	private String jTo;
	
	private String dOj;

	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getjFrom() {
		return jFrom;
	}

	public void setjFrom(String jFrom) {
		this.jFrom = jFrom;
	}

	public String getjTo() {
		return jTo;
	}

	public void setjTo(String jTo) {
		this.jTo = jTo;
	}

	public String getdOj() {
		return dOj;
	}

	public void setdOj(String dOj) {
		this.dOj = dOj;
	}

	@Override
	public String toString() {
		return "Passenger [pId=" + pId + ", fName=" + fName + ", lName=" + lName + ", jFrom=" + jFrom + ", jTo=" + jTo
				+ ", dOj=" + dOj + "]";
	}

	
	
}
