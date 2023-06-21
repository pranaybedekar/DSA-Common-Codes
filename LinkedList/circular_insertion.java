package LinkedList;

import java.util.Scanner;

import LinkedList.single_insertion.Node;

public class circular_insertion {
	
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
	Node tail=null;
	
	public void craetion()
	{
		int data,n,m,p;
		Scanner sc=new Scanner(System.in);
		do
		{
		System.out.println("Enter data");
		data=sc.nextInt();
		Node new_Node=new Node(data);
		if(head==null)
		{
			head=new_Node;
			tail=new_Node;
			new_Node.next=head;
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
				tail.next=head;
				break;
			
			
			case 2:
				tail.next=new_Node;
				tail=new_Node;
				new_Node.next=head;


				break;
				
			case 3:
				System.out.println("enter position of node to be inserted");
				p=sc.nextInt();
				Node temp1=head;
				for(int i=0;i<(p-1);i++)
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
			do
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			while(temp!=head);
		    }
	}
	
	public static void main(String []args)
	{
		circular_insertion ll=new circular_insertion();
		ll.craetion();
		ll.traverser();
	}
}


