package basicsprograms;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;


public class MapInterface2
{
	public static void main(String[] args)
	{
		Map<String, Character> ma = new HashMap<String, Character>();
		ma.put("Anil", 'M');
		ma.put("Sheetal", 'F');
		ma.put("Muskan", 'F');
		ma.put("Ashu", 'M');
		ma.put("Dolly", 'F');
		System.out.println(ma);
		
		System.out.println(ma.keySet());
		System.out.println(ma.values());
		
		ma.putIfAbsent("Pallav", 'M');
		ma.putIfAbsent("Anil", 'M');      // It's not added because key Anil is already there
		System.out.println(ma);
		
		System.out.println("-------Iteration of Keys & values seprately-------");
		for(String s1:ma.keySet())
		{
			System.out.println(s1);
		}
		for(Character c1:ma.values())
		{
			System.out.println(c1);
		}
		
		System.out.println("-------Forward Iteration using entrySet() Method-------");
		for(Entry<String, Character> e1: ma.entrySet())
		{
			System.out.println(e1);
		}
		
		Set<Entry<String, Character>> s8 = ma.entrySet();
		System.out.println("-------Forward Iteration using Iterator-------");
		Iterator <Entry <String, Character>> i9 =  s8.iterator();
		while(i9.hasNext())
		{
			System.out.println(i9.next());
		}
	}
}
