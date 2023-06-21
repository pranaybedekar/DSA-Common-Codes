package Array;

import java.util.Scanner;


public class delete_index {
	public static void main(String []args)
	{
		int n,p;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element of array ");
		n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n-1];
		System.out.println("Enter value");
		for(int i=0; i<n; i++)                              
		{
			a[i]=sc.nextInt();
		}
		System.out.println("new value to be deleted");
		p=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(i<p)
			{
				b[i]=a[i];
			}
			else if(i==p)
			continue;
			else
			{
				b[i-1]=a[i];
			}
		}
		System.out.print("element are:");
		for(int i=0;i<n-1;i++)
		{
			System.out.println(b[i]);
		}
	}

}
