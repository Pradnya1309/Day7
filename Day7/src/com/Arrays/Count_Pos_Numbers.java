package com.Arrays;

import java.util.Scanner;

public class Count_Pos_Numbers 
{

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size Of ARray:");
		int size = sc.nextInt();
		
		int a[] = new int[size];
		System.out.println("ENter Array Elements:");
		for(int i=0;i<a.length;i++)
		{
			a[i]= sc.nextInt();
		}
		
		int PositiveCount =0;
		for(int i=0;i<a.length;i++)
		{
		   if(a[i]>0)
		   {
			   PositiveCount++;
		   }
			
		}
		
		System.out.println("The Positive Count  Is:"+PositiveCount);
		
}
}
