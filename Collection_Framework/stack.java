package Collection_Framework;

import java.util.List;
import java.util.Stack;

public class stack {
	public static void main(String []args)
	{
		Stack<Integer> c=new Stack<Integer>();
		c.push(100);
		c.push(200);
		c.push(300);
		c.push(400);
		System.out.println(c);
		
		int d=c.peek();
		System.out.println(d);
		
		c.pop();
		System.out.println(c);
		
	}

}
