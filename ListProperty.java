package basicsprograms;
import java.util.ArrayList;
import java.util.List;

//  Indexing, Null, Duplicates, order of insertion
public class ListProperty
{
	public static void main(String[] args)
	{
		List li = new ArrayList();
		
		li.add("ram");         // add is method
		li.add("laxman");
		li.add("bhim");
		li.add("sushma");
		li.add("yuraj");
		li.add(null);                      
		li.add(null);
		li.add("ram");
		
		System.out.println(li);
	}
}
	
	
