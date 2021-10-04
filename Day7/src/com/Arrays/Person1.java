/*Write a java program to create a array of 3 person .Take input or
 *  hardcode  for all  three person from console. Person class is as follows 
             Person (int id, String name, Vehicle v[] )
            Vehicle (int vid, String vname) */
package com.Arrays;
import java.util.Arrays;
public class Person1 
{

	private int Pid;
	private String pName;
	private Vehicle1 v[];
	
	
	
	public Person1() 
	{ 
    
	}
		
	public Person1(int pid, String pName, Vehicle1[] v) {
		super();
		Pid = pid;
		this.pName = pName;
		this.v = v;
	}
	
	
	public int getPid() 
	{
		return Pid;
	}
	public void setPid(int pid)
	{
		Pid = pid;
	}
	public String getpName() 
	{
		return pName;
	}
	public void setpName(String pName) 
	{
		this.pName = pName;
	}
	public Vehicle1[] getV() 
	{
		return v;
	}
	public void setV(Vehicle1[] v)
	{
		this.v = v;
	}
	
	
	public String toString()
	{
		return "Person1 [Pid=" + Pid + ", pName=" + pName + ", Vehicle=" + Arrays.toString(v) + "]";
	}
	
	
	
	
	
	
}