package com.Arrays;

import java.util.Arrays;

public class AlterPosNeg 
{
   public static void main(String[] args) {
	
	   //Input: {1, 2, 3, -4, -1, 4}
	  // Output: {-4, 1, -1, 2, 3, 4}
	   
	   int a[] = {1,2,3,-4,-1,4,3,4,-5-2-7};
	   int b[] = new int[a.length];
	   
	   int pos=0;
	   int neg=0;
	   for(int i=0;i<b.length;)
	   {
		   while(pos<a.length && a[pos]>0)
		   {
			   pos++;
			   
		   }
		   
		   if(pos<a.length)
		   {
			   b[pos++]=a[i++];
		   }
		   
		   while(neg<a.length && a[neg]<0)
		   {
			   neg++;
			   
		   }
		   
		   if(neg<a.length)
		   {
			   b[neg++]=a[i++];
		   }
	   }
	   
	   System.out.println(Arrays.toString(b));
	   
}
}
