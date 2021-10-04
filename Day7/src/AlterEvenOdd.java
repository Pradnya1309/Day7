

import java.util.Arrays;

public class AlterEvenOdd
{
	public static void main(String[] args) {
	

	 int a[] = {1,2,3,4,5,6,7,8,9};
	 
	 int c[] = new int[a.length];
	 
	 int even=0,odd=0;
	 
	 for(int i=0;i<c.length;)
	 {
		 while(even<a.length && a[even]%2!=0)
		 {
			 even++;
		 }
		 
		 if(even<a.length)
		 {
			 c[i++] = a[even++];
			 
		 }
		 
		 while(odd<a.length && a[odd]%2==0)
		 {
			 odd++;
		 }
		 
		 if(odd<a.length)
		 {
			 c[i++] = a[odd++];
			 
		 }
		 
		 
		 
	 }
		 
	 System.out.println(Arrays.toString(c));
		 
		 
	}
}
