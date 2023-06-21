package Tree;
import java.util.Scanner;


public class tree_traversal_inorder_preorde_postorder{
	
		static Node create()
		{
			Scanner sc=new Scanner(System.in);
			Node root=null;
			System.out.println("enter value");
			int data=sc.nextInt();
			if(data==-1)
			 return null;
			root=new Node(data);
			System.out.println("enter left child of " + root);
			root.left=create();
			System.out.println("enter right child of " + root);
			root.right=create();
			return root;
		
	}
		static void inorder(Node root)
		{
			if(root==null)
				return;
			inorder(root.left);
			System.out.println(root.data );
			inorder(root.right);
		}
		
		static void preorder(Node root)
		{
			if(root==null)
				return;
			preorder(root.left);
			System.out.println(root.data );
			preorder(root.right);
		}
		
		static void postorder(Node root)
		{
			if(root==null)
				return;
			postorder(root.left);
			System.out.println(root.data );
			postorder(root.right);
		}
		
	public static void main(String []args)
	{
		Node root=create();
		inorder(root);
		inorder(root);
		postorder(root);
	}

}
class Node1
{
	Node left,right;
	int data;
	public Node1(int data)
	{
		this.data=data;
		left=null;
		right=null;
	}
}
