package com.Arrays;

import java.util.Scanner;

public class Count_Duplicate_Value 
{ 
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Size Of ARray:");
			int size = sc.nextInt();
			
			int a[] = new int[size];
			System.out.println("Please Enter "+ size +"  Elements Of an Array:");
			for(int i=0;i<a.length;i++)
			{
				a[i]= sc.nextInt();
			}
			
			int count =0;
			for(int i=0;i<a.length;i++)
			{
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						count++;
						break;
						
					}
				}
			}
			
			System.out.println("COunt Is:"+count);
			
			
		}
	}


