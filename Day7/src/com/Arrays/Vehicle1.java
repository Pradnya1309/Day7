/*Write a java program to create a array of 3 person .Take input or
 *  hardcode  for all  three person from console. Person class is as follows 
             Person (int id, String name, Vehicle v[] )
            Vehicle (int vid, String vname) */
package com.Arrays;

public class Vehicle1 
{
    private int vid;
    private String vName;
    
	public int getVid() 
	{
		return vid;
	}
	public void setVid(int vid) 
	{
		this.vid = vid;
	}
	public String getvName() 
	{
		return vName;
	}
	public void setvName(String vName) 
	{
		this.vName = vName;
	}
	
	public Vehicle1() {
	}

	public Vehicle1(int vid, String vName) {
		super();
		this.vid = vid;
		this.vName = vName;
	}
	public String toString()
	{
		return "Vehicle1 [vid=" + vid + ", vName=" + vName + "]";
	}
	
	
    
    
}
