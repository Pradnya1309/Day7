package com.Arrays;

import java.util.Scanner;

public class Person1_Vehicle1 
{
	public static void main(String[] args) {
		
		   Scanner sc = new Scanner(System.in);
		   
		   Person1 p[] = new Person1[3];

		   
		   for(int i=0;i<p.length;i++)
		   {
			   p[i] = new Person1();
			   System.out.println("Enter Person Id:");
			   p[i].setPid(sc.nextInt());
			   System.out.println("Enter Person Name:");
			   p[i].setpName(sc.next());
			   
			   System.out.println("Enter Vehicle u want....");
			   int v = sc.nextInt();
			   
			   Vehicle1 v1[] = new Vehicle1[v];
               
			   for(int j=0;j<v1.length;j++)
			   {
//				  
				   System.out.println("Enter Vehicle Id N Name:");
				   int vid = sc.nextInt();
				   String vname = sc.next();
				   v1[j] = new Vehicle1(vid,vname);
			   }    
			   
			   p[i].setV(v1);
			   
		   }   
		   
		    for(Person1 person:p)
		   {
			   System.out.println(person);
		   }
		   
		    										
	   
	}
}
