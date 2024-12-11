package basicsprograms;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Iterator
public class ListProperty2
{
	public static void main(String[] args)
	{

		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(11);
		l2.add(45);
		l2.add(76);
		l2.add(9);
		l2.add(87);
		System.out.println(l2);
		
		Iterator<Integer> i1 = l2.iterator();        // iterator i abstract method and Iterator Interface 
		
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}
}
