package com.Arrays;
import java.util.Scanner;

public class Count_Even_Odd 
{
		public static void main(String[] args) 
		{
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Size Of ARray:");
			int size = sc.nextInt();
			
			int a[] = new int[size];
			System.out.println("ENter Array Elements:");
			for(int i=0;i<a.length;i++)
			{
				a[i]= sc.nextInt();
			}
			
			int Evencount=0;
			int OddCount=0;
			for(int i=0;i<a.length;i++)
			{
				   if(a[i]%2==0)
				   {
					   Evencount++;
				   }
				   else
				   {
					   OddCount++;
				   }
			}
			System.out.println("The Evencount Is:"+Evencount);
			System.out.println("The OddCount Is:"+OddCount);

			
		}
	}


