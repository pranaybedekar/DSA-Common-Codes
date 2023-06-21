package Queue;

import java.util.*;
class Queue
{
	
	int f=-1,r=-1;
	int n=10;
	int q[]=new int [n];
	
	void enqueue()
	{
		if(r==(n-1))
		{
			System.out.println("Overflow condition");
		}
		else
		{
			System.out.println("enter data");
			Scanner sc=new Scanner(System.in);
			int i=sc.nextInt();
			
			if(f==-1 && r ==-1)
			{
				f=0;
				r=0;
				q[r]=i;
			}
			else
			{
				r=r+1;
				q[r]=i;
			}
		}
		
	}
		void dequeue()
		{
			if(f==-1 && r==-1)
			{
				System.out.println("underflow condition");
			}
			else
			{
				f=f+1;
			}
		}
		void display()
		{
			for(int i=f;i<=r;i++)
			{
				System.out.println(q[i]);
			}
		}
	}
public class Queue_array {
	public static void main(String []args)
	{
		int d,l;
		Scanner sc=new Scanner(System.in);
		Queue s=new Queue();
		do
		{
			System.out.println("press 1 for enqueue");
			System.out.println("press 2 for dequeue");
			System.out.println("press 3 for display");
			System.out.println("enter your choice");
			d=sc.nextInt();
			switch(d)
			{
			case 1:
			{
				s.enqueue();
				break;
			}
			case 2:
			{
				s.dequeue();
				break;
			}
			case 3:
				s.display();
				break;
			}
			System.out.println("enter 0 to go back the main menu");
			System.out.println("enter any key to exit");
			l=sc.nextInt();
		}
		while(l==0);
		System.out.println("exit successfully");
		}

}

