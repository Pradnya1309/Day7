package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Person_Main 
{
   public static void main(String[] args) {
	
	   Scanner sc = new Scanner(System.in);
	   
	   Person p[] = new Person[3];
	   
	   for(int i=0;i<p.length;i++)
	   {
		   p[i] = new Person();
		   System.out.println("Enter Person Id:");
		   p[i].setPid(sc.nextInt());
		   System.out.println("Enter Person Name:");
		   p[i].setpName(sc.next());
		   System.out.println("Enter Person Salary:");
		   p[i].setpSalary(sc.nextFloat());
	   
		 
		   
	   
	   System.out.println("How Many Vehicle u Want......");
	   int v = sc.nextInt();
	   
	   String s[] = new String[v];
	   for(int i1=0;i1<s.length;i1++)
	   {
		   System.out.println("Enter Vehicle Name...");
		   s[i1] = sc.next();
	   }
	   
	   p[i].setVehicle(s);
	   
	   }
	   
	   //Arrays.sort(p);
	   
	   for(Person person:p)
	   {
		   System.out.println(person);
	   }
}
}
