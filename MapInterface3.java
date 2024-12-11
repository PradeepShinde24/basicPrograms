package basicsprograms;

import java.util.HashMap;
import java.util.Map;

public class MapInterface3
{
	public static void main(String[] args)
	{
		Map<String, Character> m1 = new HashMap<String, Character>();
		m1.put("Anil", 'M');
		m1.put("Sheetal", 'F');
		m1.put("Muskan", 'F');
		m1.put("Ashu", 'M');
		m1.put("Dolly", 'F');
		System.out.println(m1);
		
		boolean b1 = m1.isEmpty();
		System.out.println(b1);

		boolean b2 = m1.containsKey("Manish");
		System.out.println(b2);

		boolean b3 = m1.containsValue('F');
		System.out.println(b3);
		
		m1.clear();
		System.out.println(m1);
	}
}
