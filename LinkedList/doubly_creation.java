package LinkedList;
import java.util.Scanner;

public class doubly_creation {
	
	static class Node
	{
		int data;
		Node next;
		Node prev;
		
		Node(int data)
		{
			this.data=data;
			this.next=null;
			this.prev=null;
		}
	}
	Node head=null;
	Node tail=null;
	
	public void craetion()
	{
		int data,n;
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
			//new_Node.next=head;
		}
		else
		{
			head.prev=new_Node;
			new_Node.next=head;
			head=new_Node;
			//tail.next=head;
		}
		System.out.println("Do you want to add more data. if yes then press 1");
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
			while(temp!=null);
		    }
	}
	
	public static void main(String []args)
	{
		doubly_creation ll=new doubly_creation();
		ll.craetion();
		ll.traverser();
	}
}


