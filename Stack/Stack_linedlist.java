package Stack;

import java.util.*;

class stack1{
	static class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}}
		Node top=null;
	
	void push()
	{
		System.out.println("Enter data");
		Scanner sc=new Scanner(System.in);
		int data=sc.nextInt();
		Node new_Node=new Node(data);
		if(top==null)
		{
			top=new_Node;
			//System.out.println("underflow condition");
		}
		else
		{
			new_Node.next=top;
			top=new_Node;
		}
	}
	void pop()
	{
		if(top==null)
		{
			System.out.println("Stackm is empty");
		}
		else
		{
			top=top.next;
		}
	}
	void display()
	{
		Node temp=top;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
}
public class Stack_linedlist {
	public static void main(String []args)
	{
		int d,l;
		Scanner sc=new Scanner(System.in);
		stack1 s=new stack1();
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

