package basicsprograms;

import java.util.HashMap;
import java.util.Map;

public class MapInterface1
{
	public static void main(String[] args)
	{
		Map<String, Integer> m1 = new HashMap<String, Integer>();       // upcasting
		m1.put("Ramesh", 42);
		m1.put("Sanket", 49);
		m1.put("Pallavi", 38);
		m1.put("Niranjan", 39);
		m1.put("Swital", 50);
		System.out.println(m1);
		
		Map<String, Integer> m2 = new HashMap<String, Integer>();       // upcasting
		m2.putAll(m1);
		m2.put("Adharsh", 7);
		m2.put("Asha", 9);
		System.out.println(m2);
		
		m2.remove("Pallavi");
		m2.remove("Adharsh", 7);
		
		m2.replace("Swital",61);
		m2.replace("Asha", 9, 10);
		System.out.println(m2);
		

		
//		boolean b1 = m1.equals(m2);
//		System.out.println(b1);
		
		
	}
}
