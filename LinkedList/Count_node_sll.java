package LinkedList;
import java.util.Scanner;

public class Count_node_sll {
	
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
		int data,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter data");
		do
		{
		data=sc.nextInt();
		Node new_Node=new Node(data);
		if(head==null)
		{
			head=new_Node;
		}
		else
		{
			new_Node.next=head;
			head=new_Node;
		}
		System.out.println("Do you want to add more data. if yes then press 1");
		n=sc.nextInt();
		}
		while(n==1);
	}
	

	public void traverser()
	{
		int c=0;
		Node temp=head;
		while(temp!=null)
		{
			c++;
			temp=temp.next;
		}
		System.out.println(c);
	}
	
	public static void main(String []args)
	{
		Count_node_sll ll=new  Count_node_sll();
		ll.craetion();
		ll.traverser();
	}
}

