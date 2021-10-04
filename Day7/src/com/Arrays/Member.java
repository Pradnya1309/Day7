package com.Arrays;


public class Member 
{
    private String mName;
    private int age;
    private  int adharNumber;
    
	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAdharNumber() {
		return adharNumber;
	}

	public void setAdharNumber(int adharNumber) {
		this.adharNumber = adharNumber;
	}

	public Member(String mName, int age, int adharNumber) {
		super();
		this.mName = mName;
		this.age = age;
		this.adharNumber = adharNumber;
	}
    
	public Member()
	{
		
	}

	@Override
	public String toString() {
		return "Member [mName=" + mName + ", age=" + age + ", adharNumber=" + adharNumber + "]";
	}
	
	
    
}
