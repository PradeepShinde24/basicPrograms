package basicsprograms;

public class StringVSBuilderVSBuffer
{
	public static void main(String[] args)
	{
		// Strings are immutable  (immutable means we can not change)
		String a = "automation";
		String a1 = new String("automation");      // we can also write like this
		String b = a.concat(" testing");
		System.out.println(a);
		System.out.println(b);
		
		// mutable	
		StringBuffer s1 = new StringBuffer("automation");
		s1.append(" testing");
		System.out.println(s1);
		
		// mutable
		StringBuffer s2 = new StringBuffer("api");
		s2.append(" testing");
		System.out.println(s2);
		
		
		// Constructor of StringBuffer Class
		StringBuffer s6 = new StringBuffer();        // Empty string buffer with initial capacity of 16
		StringBuffer s5 = new StringBuffer("automation");     // String buffer with the specified String
		StringBuffer s3 = new StringBuffer(20);      // Empty String buffer with the specified capacity as length
		
		
		StringBuilder s7  = new StringBuilder();
		StringBuilder s8  = new StringBuilder("automation");
		StringBuilder s9  = new StringBuilder(30);
		
	}
}
