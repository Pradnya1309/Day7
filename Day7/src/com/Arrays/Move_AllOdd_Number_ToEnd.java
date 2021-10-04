package com.Arrays;

public class Move_AllOdd_Number_ToEnd 
{
 
	 public static void main(String args[])
	    {
	        int a[] = { 1,2,3,4,5,6,7,8,9 };
	        int j = -1,temp;
	     
	        for (int i = 0; i < a.length; i++) 
	        {
	     
	             if (a[i] %2== 0) 
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

