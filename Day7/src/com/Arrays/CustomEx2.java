package com.Arrays;

import java.util.Arrays;

public class CustomEx2 
{

	 private int eId;
	 private String eName;
	 private float salary;
	// private String[] cName;
	 
	 public CustomEx2() {

	 }
	 
	 
	public CustomEx2(int eId, String eName, float salary, String[] cName) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.salary = salary;
		//this.cName = cName;
	}


	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

//	public String[] getcName() {
//		return cName;
//	}
//
//
//   public void setcName(String[] cName) {
//		this.cName = cName;
//	}


	@Override
	public String toString() {
		return "CustomEx2 [eId=" + eId + ", eName=" + eName + ", salary=" + salary 
				+ "]";
	}
	
	
	 
	 
	
}
