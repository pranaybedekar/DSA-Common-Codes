package Collection_Framework;


import java.util.LinkedList;
import java.util.Queue;

public class queue {
	public static void main(String []args)
	{
		Queue<Integer> c=new LinkedList<Integer>();
		c.offer(100);
		c.offer(200);
		c.offer(300);
		c.offer(400);
		System.out.println(c);
		
		int d=c.peek();
		System.out.println(d);
		
		c.poll();
		System.out.println(c);
		
	}

}

