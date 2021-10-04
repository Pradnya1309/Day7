package com.Arrays;

import java.util.Arrays;

public class Person 
{

	private int Pid;
	private String pName;
	private float pSalary;
	private String[] vehicle;
	
	
	public int getPid()
	{
		return Pid;
	}
	
	public void setPid(int p)
	{
		Pid = p;
	}
	
	public String getpName()
	{
		return pName;
	}
	
	public void setpName(String Name)
	{
		pName = Name;
	}
	

	public float getpSalary() 
	{
		return pSalary;
	}

	public void setpSalary(float pSalary) 
	{
		this.pSalary = pSalary;
	}

	public String[] getVehicle()
	{
		return vehicle;
	}
	
	public void setVehicle(String[] v)
	{
		vehicle = v;
	}
	
	public String toString()
	{
		return "person [ Id:"+Pid+","+"Person Name:"+pName+","+"Person Salary:"+pSalary
				+","+"Vehicle Name:"+Arrays.toString(vehicle);
	}
	
	
	
	
	
}
