package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx 
{
  public static void main(String[] args) {
	  int a[] = new int[] {1,2,3,4,5,6,7,8,9};
		System.out.println("The Original Array Element Is:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(" "+a[i]);
		}
		
		System.out.println("\nThe Arrange Nagative Positive element Is:");
		
		for(int i=0;i<a.length;i++)
		{
		if(a[i]%2==0)
		{
		   System.out.print(" "+a[i]);
		}
		}
                                  
		for(int i=0;i<a.length;i++)
		{
			
		if(a[i]%2!=0)
		{
			System.out.print(" "+a[i]);
		}
		}
		                         
		
		
		
	  
	  
}
}
