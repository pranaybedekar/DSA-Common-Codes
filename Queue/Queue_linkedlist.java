package Queue;


import java.util.*;

class queue1{
	static class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}}
		Node f=null;
		Node r=null;
	
	void enqueue()
	{
		System.out.println("Enter data");
		Scanner sc=new Scanner(System.in);
		int data=sc.nextInt();
		Node new_Node=new Node(data);
		if(f==null)
		{
			f=new_Node;
			r=new_Node;
			//System.out.println("underflow condition");
		}
		else
		{
			r.next=new_Node;
			r=new_Node;
		}
	}
	void dequeue()
	{
		if(f==null && r==null)
		{
			System.out.println("underflow condition");
		}
		else
		{
			f=f.next;
		}
	}
	void display()
	{
		Node temp=f;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
}
public class Queue_linkedlist {
	public static void main(String []args)
	{
		int d,l;
		Scanner sc=new Scanner(System.in);
		queue1 s=new queue1();
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


