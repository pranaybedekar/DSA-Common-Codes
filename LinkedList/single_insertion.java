package LinkedList;

import java.util.Scanner;

public class single_insertion {
	
	static class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	Node head=null;
	
	public void craetion()
	{
		int data,n,p,m;
		Scanner sc=new Scanner(System.in);
		do
		{
		System.out.println("Enter data");
		data=sc.nextInt();
		Node new_Node=new Node(data);
		if(head==null)
		{
			head=new_Node;
		}
		else
		{
		System.out.println("Enter 1 to insert the item at beginning, 2 to insert item at the end, 3 to insert the item at middle");
		m=sc.nextInt();
		switch(m)
		{
		case 1:
			new_Node.next=head;
			head= new_Node;
			break;
		
		
		case 2:
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=new_Node;
			break;
			
		case 3:
			System.out.println("enter position of node to be inserted");
			p=sc.nextInt();
			Node temp1=head;
			for(int i=0;i<p;i++)
			{
				temp1=temp1.next;
			}
			new_Node.next=temp1.next;
			temp1.next=new_Node;
			break;
		}
		}
		System.out.println("Do you want to add more data. if yes, prees 1");
		n=sc.nextInt();
	}
		while(n==1);
	}
	

	public void traverser()
	{
		Node temp=head;
		if(head==null)
		{
			System.out.println("LL does not exit");
		}
		else
		{
			while(temp!=null)
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
		}
	}
	
	public static void main(String []args)
	{
		single_insertion ll=new single_insertion();
		ll.craetion();
		ll.traverser();
	}
}
