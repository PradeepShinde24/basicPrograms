package basicsprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionVSCollections
{
	public static void main(String[] args)
	{
		List<String> li = new ArrayList<String>();
		li.add("ram");
		li.add("laxman");
		li.add("bhim");
		li.add("sushma");
		li.add("yuraj");
		Collections.sort(li);
		System.out.println(li);
		
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(11);
		l2.add(45);
		l2.add(76);
		l2.add(9);
		l2.add(87);
		Collections.sort(l2);
		System.out.println(l2);
		
	}
}

