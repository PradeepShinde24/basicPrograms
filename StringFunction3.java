package basicsprograms;

public class StringFunction3
{
	public static void main(String aregs [])
	{
		String a = "school";
		System.out.println(a.replace('s', 'a'));
		
		String a1 = "kv no 2 ";
		System.out.println(a1.replaceAll("[0-9]", ""));
		
		String a2 = "Pradeep Namdev Shinde";
		System.out.println(a2.replaceAll("[A-Z]", ""));
		
		System.out.println(a2.replaceAll("[a-z]", ""));
		
		System.out.println(a2.replace("Namdev", ""));
	}
}
