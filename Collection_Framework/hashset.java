package Collection_Framework;

import java.util.Set;
import java.util.HashSet;
public class hashset {

	public static void main(String[] args) {
		Set<Integer> c=new HashSet<>();
		c.add(100);
		c.add(200);
		c.add(300);
		c.add(400);
		System.out.println(c);
		
		c.remove(2);
		System.out.println(c);
		
		int d=c.size();
		System.out.println(d);
		

	}

}
