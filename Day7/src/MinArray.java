import java.util.Scanner;

public class MinArray
{
    public static void main(String[] args) {
		
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("ENter Array Size:");
    	int size = sc.nextInt();
    	
    	int a[] = new int[size];
    	System.out.println("Enter Array Elements:");
    	
    	for(int i=0;i<a.length;i++)
    	{
    		a[i] = sc.nextInt();
    	}
    	
    	int min= a[0];
    	for(int i=1;i<a.length;i++)
    	{
    		if(a[i]<min)
    	     {
    			min=a[i];
    			
    	     }	
    	}
		System.out.println("The Minimum Array Elements Is:"+min);

    	
    }
   
 }
    
    	
    	
    	
    

