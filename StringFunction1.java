package basicsprograms;

public class StringFunction1
{
	public static void main(String[] args)
	{
		String a = "School name is KV No 2";
		String b =  "pradeep";
		
		boolean b1 = b.equals("pradeep");
		System.out.println(b1);
		
		System.out.println(b.charAt(4));
		System.out.println(b.indexOf('d'));
		System.out.println(b.concat(" namdev").concat(" shinde"));
		
		String c = " and its location is Nashik";
		System.out.println(a.concat(c));
		
		
		
		
		
	}
}
