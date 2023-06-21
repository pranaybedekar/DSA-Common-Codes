package Array;
import java.util.Scanner;

public class add_index {
	public static void main(String []args)
	{
		int m,n,p;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element of array ");
		n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n+1];
		System.out.println("Enter value");
		for(int i=0; i<n; i++)                              
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter the index ");
		m=sc.nextInt();
		System.out.println("new value to be inserted");
		p=sc.nextInt();
		for(int i=0;i<n+1;i++)
		{
			if(i<m)
			{
				b[i]=a[i];
			}
			else if(i==m)
			{
				b[i]=p;
			}
			else
			{
				b[i]=a[i-1];
			}
		}
		System.out.print("element are:");
		for(int i=0;i<n+1;i++)
		{
			System.out.println(b[i]);
		}
	}

}
