package Queue;

import java.util.*;
class Queue2
{
	
	int f=-1,r=-1;
	int n=10;
	int q[]=new int [n];
	
	void enqueue()
	{
		if(f==(r+1)%n)
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
				r=(r+1)%n;
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
			else if(f==r)       //there is only one element in queue that time it will arise
			{
				System.out.println("underflow condition");
				f=-1;
			}
			{
				f=(f+1)%n;
			}
		}
		void display()
		{
			int i;
			System.out.println("items are:");
			for(i=f;i!=r;i=(i+1)%n)
			{
				System.out.println(q[i]);
			}
			System.out.println(q[i]);
		}
	}
public class circularqueue_ll {
	public static void main(String []args)
	{
		int d,l;
		Scanner sc=new Scanner(System.in);
		Queue2 s=new Queue2();
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

