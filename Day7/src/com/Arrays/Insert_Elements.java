package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Insert_Elements {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("ENter many elements do u want to insert.....:");
		int size = sc.nextInt();
		
		int a[] = new int[10];
		System.out.println("Please Enter "+ size +" Elements Of an Array:");
    	
    	for(int i=0;i<size;i++)
    	{
    		a[i] = sc.nextInt();
    	}
    	
    	System.out.println(Arrays.toString(a));

    	
    	System.out.println("Enter Data..u want to insert....");
    	int data = sc.nextInt();
    	
    	System.out.println("ENter Index ..u want to insert....");
    	int index = sc.nextInt();
    	
    	if(index>size)
    	{
    		System.out.println("Invalid....");
    	}
    	else
    	{
    		for(int i=size-1;i>=index;i--)
    		{
    			a[i+1] = a[i];
    		}
    		
    		a[index] = data;
    	}
    	
    	System.out.println(Arrays.toString(a));	
		
	}

}
