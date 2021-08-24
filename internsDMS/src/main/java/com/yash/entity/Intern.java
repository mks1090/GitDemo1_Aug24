package com.yash.entity;

import java.util.Date;

public class Intern {
	// comments continued......
	// comments from Rajesh_S
	//Comments
	private int internId;
	private String internFirstName;
	private String internLastName;
	private Date internDOB;
	private Date internHireDate;
	
	public int getInternId() {
		return internId;
	}
	public void setInternId(int internId) {
		this.internId = internId;
	}
	public String getInternFirstName() {
		return internFirstName;
	}
	public void setInternFirstName(String internFirstName) {
		this.internFirstName = internFirstName;
	}
	public String getInternLastName() {
		return internLastName;
	}
	public void setInternLastName(String internLastName) {
		this.internLastName = internLastName;
	}
	public Date getInternDOB() {
		return internDOB;
	}
	public void setInternDOB(Date internDOB) {
		this.internDOB = internDOB;
	}
	public Date getInternHireDate() {
		return internHireDate;
	}
	public void setInternHireDate(Date internHireDate) {
		this.internHireDate = internHireDate;
	}
	public Intern(int internId, String internFirstName, String internLastName, Date internDOB, Date internHireDate) {
		super();
		this.internId = internId;
		this.internFirstName = internFirstName;
		this.internLastName = internLastName;
		this.internDOB = internDOB;
		this.internHireDate = internHireDate;
	}
	public Intern() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Intern [internId=" + internId + ", internFirstName=" + internFirstName + ", internLastName="
				+ internLastName + ", internDOB=" + internDOB + ", internHireDate=" + internHireDate + "]";
	}
	
	
	

}
