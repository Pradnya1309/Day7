package com.Arrays;

import java.util.Arrays;

public class PosNegZero 
{
  public static void main(String[] args) 
  {
	  int a[] = new int[] {1,2,-9,-6,0,0-4,-56};

	 
	  int neg=0;
	  int zero = 0;
	  int pos = 0;
	  int p[] = new int[5];
	  int n[] = new int[9];
	  int z[] = new int[8];
	  
	  
	  
	  //int i=0;
	  for(int pn:a)
	  {
		  
		  if(pn>0)
		  {
			  p[pos] = pn;
			  pos++;
		  }
		  else if(pn<0)
		  {
			  n[neg] = pn;
			  neg++;
		  }
		  else
		  {
			  z[zero] = pn;
			  zero++;
		  }
			  
	  }
	  
	  System.out.println(Arrays.toString(p));
	  System.out.println(Arrays.toString(n));
	  System.out.println(Arrays.toString(z));

	  
	  
}
}
