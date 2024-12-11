package basicsprograms;

public class PalindromeString
{
	public static void main(String[] args)
	{
		String input = "radar";
		String reverse = "";
		
		for(int i= input.length()-1; i>=0; i--)
		{
			char c1 = input.charAt(i);
			reverse = reverse + c1;
			
		}
		System.out.println(reverse);
		
		if(input.equals(reverse))
		{
			System.out.println("It is a palindrome");
		}
		else
		{
			System.out.println("It is not palindrome");
		}
	}
}
