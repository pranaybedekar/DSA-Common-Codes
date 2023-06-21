package LinkedList;
import java.util.Scanner;

public class find_max_data_sll {
	
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
		int max=0;
		Node temp=head;
		while(temp!=null)
		{
			if(temp.data>max)
			{
				max=temp.data;
			}
			temp=temp.next;
		}
		System.out.println(max);
	}
	
	public static void main(String []args)
	{
		find_max_data_sll ll=new  find_max_data_sll();
		ll.craetion();
		ll.traverser();
	}
}


