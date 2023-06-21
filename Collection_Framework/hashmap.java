package Collection_Framework;
import java.util.HashMap;
import java.util.Map;

public class hashmap {

	public static void main(String[] args) {
		Map<Integer,String> c=new HashMap<>();
		c.put(10,"pranay");
		System.out.println(c);
		c.put(20,"panu");
		System.out.println(c);
		c.putIfAbsent(10,"p");
		System.out.println(c);
		c.remove(10,"p");
		System.out.println(c);

	}

}
