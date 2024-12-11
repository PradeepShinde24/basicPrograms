package basicsprograms;

public class StringBuffer_Program
{
	public static void main(String[] args)
	{
		StringBuffer s1 = new StringBuffer("Automation  Testing");
//		s1.append(" testing");
//		s1.insert(11, "QA");
//		s1.delete(0, 10);
//		s1.reverse();
		s1.replace(0, 10, "API");
		System.out.println(s1);
		
		System.out.println(s1.substring(12));
		System.out.println(s1.substring(12, 19));
	
	}
}
