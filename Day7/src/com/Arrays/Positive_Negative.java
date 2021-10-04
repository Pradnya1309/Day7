package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Positive_Negative 
{

	public static void main(String[] args) {
		
       
		Scanner sc = new Scanner(System.in);
    	System.out.println("ENter Array Size:");
    	int size = sc.nextInt();
    	
    	int a[] = new int[size];
    	System.out.println("Please Enter "+ size +" Elements Of an Array:");
    	
    	int p=0,n=0,z=0;
    	for(int i=0;i<=a.length-1;i++)
    	{
    		a[i] = sc.nextInt();
    	}
		
    	for(int i=0;i<=a.length-1;i++)
    	{
    		if(a[i]>0)
    		{
    			p++;
    		}
    		
    		else if(a[i]<0)
    		{
    			n++;
    		}
    		else if(a[i]==0)
    		{
    			z++;
    		}
    	}
    	
    	int positive[] = new int[p];
    	int Negative[] = new int[n];
    	int zero[] = new int[z];
    	
         p=0;n=0;z=0;
    	
    	for(int i=0;i<=a.length-1;i++)
    	{
    		if(a[i]>0)
    		{
    			positive[p++] = a[i];
    			
    		}		
    		
    		else if(a[i]<0)
    		{
    			Negative[n++] = a[i];

    		}
    		
    		else
    		{
    		
    			zero[z++] = a[i];
    		}
    	}
    	
    	
    	System.out.println( p+" Positive Array Is:"+ Arrays.toString(positive));
    	System.out.println(n+ " Negative Array Is:"+Arrays.toString(Negative));
    	System.out.println(z+ " Zero Array Is:"+Arrays.toString(zero));

    	

		
		
		
		
	}
}
