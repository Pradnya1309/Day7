import java.util.Scanner;

public class ArrayExample1 
{

	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array SIze:");
		int size = sc.nextInt();
	
		int a[] = new int[size];
		System.out.println("Length Of Array:"+a.length);
		
		System.out.println("Enter Array Elements:");
		for(int i=0;i<=a.length-1;i++)
		{
			a[i] = sc.nextInt();
		}

		
		System.out.println("Array Elements Are:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}

}

//a[0]=20;
//a[1]=200;
//a[2]=2000;
//a[3]=20000;
//a[4]=200000;
////a[5]=20;








