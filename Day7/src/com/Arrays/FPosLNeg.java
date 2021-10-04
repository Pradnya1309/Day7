package com.Arrays;

import java.util.Arrays;

public class FPosLNeg 
{
   public static void main(String[] args) {
	
	   // 1 4 5 8 -9 -3 -5
	   int arr[] = new int[] {1,4,-8,5,8,-6,-7};
	   
	   int j=-1;
	  for(int i=0;i<arr.length;i++)
	  {
		  if(arr[i]<0)
		  {
			  j++;
			  
			  int temp = arr[i];
			  arr[i] = arr[j];
			  arr[j] = temp;
		  }
	  }
	  
	  System.out.println(Arrays.toString(arr));
	  
//	  for(int i=0;i<arr.length;i++)
//	  {
//		  System.out.println(a[i]);
//	  }
//	   
}
}
