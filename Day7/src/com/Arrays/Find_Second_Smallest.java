package com.Arrays;

import java.util.Scanner;

public class Find_Second_Smallest {

	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
    	System.out.println("ENter Array Size:");
    	int size = sc.nextInt();
    	
    	int a[] = new int[size];
    	System.out.println("Please Enter "+ size +" Elements Of an Array:");
    	
    	for(int i=0;i<a.length;i++)
    	{
    		a[i] = sc.nextInt();
    	}
    	
    	System.out.println("The Second Smallest Elements Is:");
    	//int count=0;
    	int temp;
    	for(int i=0;i<a.length;i++)
    	{
    		for(int j=i+1;j<a.length;j++)
    		{
    			if(a[i]<a[j])
    			{
    			    temp = a[i];
    			    a[i] = a[j];
    			    a[j] = temp;
    			}
    		}
    	}
    	
    	System.out.println(a[1]);
		
		
	}

}
