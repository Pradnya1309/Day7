package com.Arrays;

import java.util.Scanner;
public class MoveAllZeorsToEnd {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the size of the array:");
		     
		    int size=sc.nextInt();
		     int arr[ ]=new int[size];
			System.out.println("Please Enter "+ size +" Elements Of an Array:");

			  int i;
		      for(i=0;i<size;i++)
		     {
		         arr[i]=sc.nextInt();
		     }
		      int c=0;

		      for(i=0;i<size;i++)
		      {
		          if(arr[i]>0)
		          {
		              arr[c]=arr[i];
		              c++;
		          }
		      }
		      
		      System.out.println(c);
		      for(i=c;i<size;i++)
		      {
		          arr[c]=0;
		          c++;
		      }
		      System.out.println("After Move all zeros to end :");
		      for(i=0;i<size;i++)
		      {
		    	  System.out.print(arr[i]+" ");
		      }
	        
	       }
       }
