/*4.	How to rearrange array in alternating positive and negative number[2]
Input: {1, 2, 3, -4, -1, 4}
Output: {-4, 1, -1, 2, 3, 4}

 * */
package com.Arrays;
import java.util.Arrays;

public class AlterPoritiveNegative 
{

		public static void main(String[] args) {
		

		 int array1[] = {1,2,3,-4,-1,4,4,5};
		 
		 int array2[] = new int[array1.length];
		 
		 int positive=0,Negative=0;
		 
		 for(int i=0;i<array2.length;)
		 {
			 while(positive<array1.length && array1[positive]>0)
			 {
				 positive++;
			 }
			 
			 if(positive<array1.length)
			 {
				 array2[i++] = array1[positive++];
				 
			 }
			 
			 while(Negative<array1.length && array1[Negative]<0)
			 {
				 Negative++;
			 }
			 
			 if(Negative<array1.length)
			 {
				 array2[i++] = array1[Negative++];
				 
				 
			 }
			 
			 
			 
		 }
			 
		 System.out.println(Arrays.toString(array2));
			 
			 
		}
	}


