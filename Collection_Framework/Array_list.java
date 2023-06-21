package Collection_Framework;
import java.util.ArrayList;
import java.util.List;

public class Array_list {
	public static void main(String []args)
	{
		List<Integer> c=new ArrayList<>();
		c.add(10);
		c.add(20);
		c.add(30);
		c.add(40);
		c.add(50);
		System.out.println(c);
		
		c.remove(2);
		System.out.println(c);
		
		c.get(2);
		System.out.println(c);
		
		//c.clear();
		//System.out.println(c);
		
		c.set(1,21);
		System.out.println(c);
		
		boolean f=c.contains(30);
		System.out.println(f);
	}

}
