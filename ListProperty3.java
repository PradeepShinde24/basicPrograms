package basicsprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

// ListIterator
public class ListProperty3
{
	public static void main(String[] args)
	{
		List li = new ArrayList();
		
		li.add("ram 1");
		li.add("laxman 2");
		li.add("bhim 3");
		li.add("sushma 4");
		li.add("yuraj 5");
		li.add("ram 6");
		
		
		System.out.println(li.get(0));
		System.out.println(li);
		
		ListIterator i2 = li.listIterator();
		
		System.out.println("Forward Iteration: ");
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		
		System.out.println("Backward Iteration: ");
		while(i2.hasPrevious())
		{
			System.out.println(i2.previous());
		}
	}
}
