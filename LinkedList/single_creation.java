package LinkedList;
import java.util.Scanner;

public class single_creation {
	
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
		single_creation ll=new single_creation();
		ll.craetion();
		ll.traverser();
	}
}
