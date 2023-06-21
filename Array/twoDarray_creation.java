package Array;
import java.util.Scanner;
public class twoDarray_creation {
	public static void main(String[] args)
	{
		int m,n;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter no.of Rows");
		n=sc.nextInt();
		System.out.println("enter no.of colomn");
		m=sc.nextInt();
		
		int a[][]=new int[n][m];
		System.out.println("Enter the value");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for (int i=0;i<n;i++)
		{
			for (int j=0;j<m;j++)
			{
		System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
}


// already known values
/*int a[][]= {{2,3},{2,4},{3,4}};
for(int i=0;i<3;i++)
{
	for(int j=0;j<2;j++)
	{
		System.out.print(a[i][j]+" ");
	}
	System.out.println();
}
}
}*/