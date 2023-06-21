package Graph;
import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class graph_implementation {
private LinkedList<Integer> adjacancy[];
public graph_implementation(int v)
{
	adjacancy=new LinkedList[v];
	for(int i=0;i<v;i++)
	{
		adjacancy[i]=new LinkedList<Integer>();
	}
}
public void insertedge(int s,int d)
{
	adjacancy[s].add(d);
	adjacancy[d].add(s);
	
	//System.out.println(adjacancy[d]);
	//System.out.println(adjacancy[s]);
}
public void bfs(int source)
{
	boolean visited_nodes[]=new boolean[adjacancy.length];
	int parent_nodes[]=new int[adjacancy.length];
	Queue<Integer> q=new LinkedList<>();
	q.add(source);
	 visited_nodes[source]=true;
	 parent_nodes[source]=-1;
	 while(!q.isEmpty())
	 {
		 int p=q.poll();
		 System.out.println(p);
		 for(int i:adjacancy[p])
		 {
			 if(visited_nodes[source]!=true)
			 {
			 visited_nodes[i]=true;
			 q.add(i);
			 parent_nodes[i]=p;
		 }
	 }}
}
public void dfs(int source1)
{
	boolean visited_nodes[]=new boolean[adjacancy.length];
	int parent_nodes[]=new int[adjacancy.length];
	Stack<Integer> q=new Stack<>();
	q.add(source1);
	 visited_nodes[source1]=true;
	 parent_nodes[source1]=-1;
	 while(!q.isEmpty())
	 {
		 int p=q.pop();
		 System.out.println(p);
		 for(int i:adjacancy[p])
		 {
			 if(visited_nodes[source1]!=true)
			 {
			 visited_nodes[i]=true;
			 q.add(i);
			 parent_nodes[i]=p;
		 }
	 }}}
public static void main(String []args)
{ 
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no. of vertex and edges");
	int v=sc.nextInt();
	int e=sc.nextInt();
	graph_implementation g=new graph_implementation(v);
	System.out.println("enter edges");
	for(int i=0;i<v;i++)
	{
		int s=sc.nextInt(); //source
		int d=sc.nextInt(); // destination
		g.insertedge(s,d);
	}
	System.out.println("enter source for bfs traversal");
	int source=sc.nextInt();
        g.bfs(source);
        System.out.println("enter source for dfs traversal");
    	int source1=sc.nextInt();
        g.dfs(source1);
	
}
}