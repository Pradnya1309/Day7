package com.Arrays;

import java.util.Arrays;

public class Flat
{
	private int flatNo;
	private String flatName;
	private Member[] m;
	
	public Flat() 
	{
		
	}

	public Flat(int flatNo, String flatName, Member[] m) {
		super();
		this.flatNo = flatNo;
		this.flatName = flatName;
		this.m = m;
	}

	public int getFlatNo() {
		return flatNo;
	}

	public void setFlatNo(int flatNo) {
		this.flatNo = flatNo;
	}

	public String getFlatName() {
		return flatName;
	}

	public void setFlatName(String flatName) {
		this.flatName = flatName;
	}

	public Member[] getM() {
		return m;
	}

	public void setM(Member[] m) {
		this.m = m;
	}

	@Override
	public String toString() {
		return "Flat [flatNo=" + flatNo + ", flatName=" + flatName + ", m=" + Arrays.toString(m) + "]";
	}
	
	
	
	
	
}
