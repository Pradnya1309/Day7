package com.Arrays;

import java.util.Arrays;

public class MoveZeroLast 
{
    public static void main(String[] args) {
		
    	
    	
		 int a[] = new int[] { 1,0,2,3,4,0,0,5,6,7,0};
		 
		 int k =0;
		 for(int i=0;i<a.length;i++)
		 {
			 if(a[i]>0)
			 {
				 a[k] = a[i];
				 k++;
			 }
		 }
		 
		 System.out.println(k);
		 for(int i=k;i<a.length;i++)
		 {
			 a[i] = 0;
			 k++;
		 }
		 
		 
		 
		 System.out.println(Arrays.toString(a));
		 

    	
    	
	}
}
