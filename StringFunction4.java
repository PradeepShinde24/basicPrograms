package basicsprograms;

public class StringFunction4
{
	public static void main(String[] args)
	{
		String a = "Pradeep Namdev";
		System.out.println(a.concat(" Shinde"));
		
		String a1 = "pradeep";
		String a2 = "Pradeep";
		boolean b1 = a1.equals(a2);
		System.out.println(b1);
		
		boolean b2 = a1.equalsIgnoreCase(a2);
		System.out.println(b2);

	}
}
