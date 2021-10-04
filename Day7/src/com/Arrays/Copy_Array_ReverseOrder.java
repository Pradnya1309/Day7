package com.Arrays;

import java.util.Scanner;

public class Copy_Array_ReverseOrder 
{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
    	System.out.println("ENter Array Size:");
    	int size = sc.nextInt();
    	
    	int a[] = new int[size];
    	int b[] = new int[size];
    	System.out.println("Please Enter "+ size +" Elements Of an Array:");
    	
    	for(int i=0;i<a.length;i++)
    	{
    		a[i] = sc.nextInt();
    	}
		
    	
    	int end = a.length-1;
    	for(int i=0;i<a.length;i++)
    	{
    		b[i] = a[end];
    		end--;
    	}
    	System.out.println("Reverse ARray Elements Is:");
    	
    	for(int i=0;i<b.length;i++)
    	{
    		System.out.print(b[i]+" ");
    	}
		
	}
}
