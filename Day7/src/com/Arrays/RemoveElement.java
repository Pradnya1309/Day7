package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {
	
	public static void main(String[] args) {
		
		
		int a[] = {1, 2, 3, 4, 5, 6, 7, 8};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter Position to remove data:");
		int pos = sc.nextInt();
		
		//int pos=5;
		
		for(int i=pos;i<a.length-1;i++)
		{
			a[i]= a[i+1];
		}
  
		 System.out.println(Arrays.toString(a));
		
		
		
		
	}

}
