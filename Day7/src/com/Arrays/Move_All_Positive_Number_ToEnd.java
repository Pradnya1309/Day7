package com.Arrays;

public class Move_All_Positive_Number_ToEnd 
{
	 public static void main(String[] args) {
		
		 int a[] = { 1,-2,-3,4,5,-6,7,8,9,-10 };
	        int j = -1,temp;
	     
	        for (int i = 0; i < a.length; i++) 
	        {
	     
	             if (a[i] < 0) 
	            {
	     
	                j++;
	     
	                temp = a[i];
	                a[i] = a[j];
	                a[j] = temp;
	            }
	        }
	        
	        for (int i = 0; i < a.length; i++)
	            System.out.print(a[i] + " ");
	    
	    }
	     	   
     }

