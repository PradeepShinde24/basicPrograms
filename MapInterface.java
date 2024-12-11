package basicsprograms;
import java.util.Map;
import java.util.HashMap;


public class MapInterface
{
	public static void main(String[] args)
	{
		Map m1 = new HashMap();       // upcasting
		
		m1.put("Ramesh", 42);
		m1.put("Sanket", 49);
		m1.put("Pallavi", 38);
		m1.put("Niranjan", 39);
		m1.put("Swital", 50);
		System.out.println(m1);
		
		// Index-> No
		// Order of insertion-> No
		
	}
	
}
