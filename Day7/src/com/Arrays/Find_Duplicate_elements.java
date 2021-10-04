package com.Arrays;

import java.util.Scanner;

public class Find_Duplicate_elements 
{
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
    	
    	System.out.println("Duplicate Elements Is........");
    	for(int i=0;i<a.length;i++)
    	{
    		for(int j=i+1;j<a.length;j++)
    		{
    			if(a[i]==a[j])
    			{
    				System.out.print(a[i]+" ");
    			}
    		}
    	}
		
		
		
		
	}

}
