package basicsprograms;
import java.util.Scanner;
import java.util.Arrays;

public class Anagram
{
	public static void main(String args[])
	{
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter the String 1 and 2:");
//		String a1 = sc.next();
//		String a2 = sc.next();
		
		String a1 = "care";
		String a2 = "race";
//		
		char c1[] = a1.toCharArray();
		char c2[] = a2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
		
		boolean b1 = Arrays.equals(c1,  c2);
		
		if(b1 == true)
		{
			System.out.println("The given 2 Strings are Anagram");
		}
		else
		{
			System.out.println("The given 2 Strings are NOT Anagram");
		}
	}
}
