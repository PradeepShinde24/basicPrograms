package basicsprograms;

public class StringFunction5
{
	public static void main(String args [])
	{
		String a1 = "Pradeep Namdev Shinde";
		
		System.out.println(a1.isEmpty());
		
		boolean b7 = a1.endsWith("Shinde");
		System.out.println(b7);
		
		boolean b1 = a1.contains("Pradeep");
		System.out.println(b1);
		
		String a2 = "ekta";
		boolean b2 = a2.matches("....");     // we have to put . how many charater or space in that so answer is true
		System.out.println(b2);   
		
		System.out.println(a2.matches("e(.*)"));   // for checking the first word is e or not
		System.out.println(a2.matches("(.*)a"));   // for checking the last word is a or not
		System.out.println(a1.matches("(.*) Namdev ().*"));
	}
}
