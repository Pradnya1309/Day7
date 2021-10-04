package com.Arrays;

import java.util.Scanner;

public class CustomEx3 
{

	public static void main(String[] args) {
		
		CustomEx2  a[] = new CustomEx2[3];
		
		Scanner sc  = new Scanner(System.in);
		
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("ENter eid,ename,salay");
			a[i] = new CustomEx2();
			a[i].seteId(sc.nextInt());
			a[i].seteName(sc.next());
			a[i].setSalary(sc.nextFloat());
			//a[i].setcName(args);
		}
		
		//System.out.println(a);
		
		for(CustomEx2 m:a)
		{
			System.out.println(m);
		}
		
		
		
		
		
	}
}
