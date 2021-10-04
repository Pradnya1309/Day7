package com.Arrays;

import java.util.Scanner;

public class Flat_Member 
{
	public static void main(String[] args) {
		
	
     Flat flat[] = new Flat[3];
     Scanner sc = new Scanner(System.in);
     
     for(int i=0;i<flat.length;i++)
	   {
		   flat[i] = new Flat();
		   System.out.println("Enter Flat Number:");
		   flat[i].setFlatNo(sc.nextInt());
		   System.out.println("Enter Flat Name:");
		   flat[i].setFlatName(sc.next());
		   
		   System.out.println("How Many Member u want....");
		   int m = sc.nextInt();
		   
		   Member m1[] = new Member[m];
         
		   for(int j=0;j<m1.length;j++)
		   {
//			  
			   System.out.println("Enter Member Name ,age,Adhar Number....");
			   String mn = sc.next();
			   int a = sc.nextInt();
			   int adhar = sc.nextInt();
			   
			   m1[j] = new Member(mn,a,adhar);			   
			   
		   }    
		   
		   flat[i].setM(m1);
		   
	   }   
	   
	    for(Flat f:flat)
	   {
		   System.out.println(f);
	   }
	   
	}
}
