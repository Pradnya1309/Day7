package com.Arrays;

import java.util.Scanner;

public class Sum_Of_Even 
{
   public static void main(String[] args) {
	
	   Scanner sc = new Scanner(System.in);
		System.out.println("ENter Array Size:");
		int size = sc.nextInt();
		
		int a[] = new int[size];
		System.out.println("Enter Array Elements:");
		
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		
		int esum=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
                esum = esum+a[i];
			}
		}
		
		System.out.println("Even Sum Is:"+esum);
	   
	   
	   
}
	
	
}
