package com.Arrays;

import java.util.Scanner;

public class Print_Unique_Elements {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
    	System.out.println("ENter Array Size:");
    	int size = sc.nextInt();
    	
    	int a[] = new int[size];
    	System.out.println("Please Enter "+ size +" Elements Of an Array:");
    	
    	for(int i=0;i<a.length;i++)
    	{
    		a[i] = sc.nextInt();
    	}
    	for(int i=0;i<a.length;i++)
    	{
        	int count=0;

    		for(int j=i+1;j<a.length;j++)
    		{
    			
    			if(a[i]==a[j] &&j<i)
    			{
    				break;
    			}
    			else if(a[i]==a[j])
    			{
    				count++;
    			}
    		}
    			if(count==0)
    			{
    				System.out.print(a[i]+" ");
    			}
    		
    		
    			
    		}
    	}
	}


