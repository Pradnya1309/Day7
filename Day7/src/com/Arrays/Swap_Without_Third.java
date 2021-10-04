package com.Arrays;

import java.util.Scanner;

public class Swap_Without_Third 
{

	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("ENter Array Size:");
		int size = sc.nextInt();
		
		int a[] = new int[size];
		int b[] = new int[size];
		
		System.out.println("Please Enter "+ size +"  Elements Of an Array:");
		
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("Please Enter "+ size +"  Elements Of an Array:");

		for(int i=0;i<b.length;i++)
		{
			b[i] = sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++)
		{
			a[i] = a[i]+b[i];
			b[i] = a[i]-b[i];
			a[i] = a[i]-b[i];
		}
		System.out.print("Swap First Array: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
			//.out.print("Swap Second Array:"+b[i]+" ");
		}
		
		System.out.println(" ");
		System.out.print("Swap Second Array: ");
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
			//.out.print("Swap Second Array:"+b[i]+" ");
		}
	}

}
