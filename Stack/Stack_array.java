package Stack;
import java.util.*;
class stack
{
	
	int top=-1;
	int n=10;
	int a[]=new int [n];
	
	void push()
	{
		if(top==(n-1))
		{
			System.out.println("Overflow condition");
		}
		else
		{
			System.out.println("Enter data");
			Scanner sc=new Scanner(System.in);
			int i=sc.nextInt();
			top=top+1;
			a[top]=i;
			System.out.println("item inserted");
		}}
		void pop()
		{
			if(top==-1)
			{
				System.out.println("Underflow condition");
			}
			else
			{
				
				top=top-1;
				
				System.out.println("item deleted");
			}
		}
		void display()
		{
			for(int j=top;j>=0;j--)
			{
				System.out.println(a[j]);
			}
		}
	}
public class Stack_array {
	public static void main(String []args)
	{
		int d,l;
		Scanner sc=new Scanner(System.in);
		stack s=new stack();
		do
		{
			System.out.println("press 1 for push");
			System.out.println("press 2 for pop");
			System.out.println("press 3 for display");
			System.out.println("enter your choice");
			d=sc.nextInt();
			switch(d)
			{
			case 1:
			{
				s.push();
				break;
			}
			case 2:
			{
				s.pop();
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
