package basicsprograms;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

// Indexing, NULL, Duplicate, Heterogeneous, 
public class SetProperty
{
	public static void main(String[] args)
	{
		Set s1 = new HashSet();
		s1.add(1);
		s1.add("ram");
		s1.add("shanu");
		s1.add(true);
		System.out.println(s1);
		
		s1.add("laxman");
		s1.add(null);
		s1.add(null);
		System.out.println(s1);
		
		Iterator i1 = s1.iterator();
		
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}
}
