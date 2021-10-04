import java.util.Scanner;

public class ReverseArray 
{
   public static void main(String[] args) 
   {
	
	   Scanner sc = new Scanner(System.in);
	   	System.out.println("ENter Array Size:");
	   	int size = sc.nextInt();
	   	
	   	int a[] = new int[size];
	   	System.out.println("Enter Array Elements:");
	   	
	   	for(int i=0;i<a.length;i++)
	   	{
	   		a[i] = sc.nextInt();
	   	}
	   	
	   	System.out.println("Reverse ARray :");
	   	for(int i=a.length-1;i>=0;i--)
	   	{
	   		System.out.print(a[i]+" ");
	   	}
	   
}
}
