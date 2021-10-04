package com.Arrays;

import java.util.Arrays;

public class ReverseArray 
{
   public static void main(String[] args)
   {
	
	   int a[] = {1,2,3,4,5,6,7,8,9};
	   
	   int end = a.length-1,temp;
	  // System.out.println(end);
	   
	   for(int start=0;start<end;start++)
	   {
		   temp = a[start];
		   a[start] = a[end];
		   a[end] = temp;
		   end--;
	   }
	   
	   System.out.println(Arrays.toString(a));
	   	   
   }
}
