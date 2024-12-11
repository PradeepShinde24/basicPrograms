package basicsprograms;
import java.util.Arrays;

public class Arrayprogram5
{
	static int countofalphabet = 0;
	static int countofdigit = 0;
	static int countofwhitespaces = 0;
	
	public static void main(String[] args)
	{
		String input = "kv no 2 #$%^&"; 
		
		boolean b = input.isEmpty();
		
		if(b == true)
		{
			System.out.println("Since String is empty we can't perform any function on it now");
		}
		else
		{
			char [] c1 = input.toCharArray();
		
		    System.out.println(Arrays.toString(c1));
		    System.out.println(input.toCharArray());
		
		    for(int i = 0; i<c1.length; i++)
		    {
		    	boolean b1 = Character.isAlphabetic(c1[i]);   	
		    	if(b1 == true)
		    	{
		    		countofalphabet++;
		    	}
		 
			    boolean b2 = Character.isDigit(c1[i]);
			    if(b2 == true)
			    {
			    	countofdigit++;
			    }
			    
			    boolean b3 = Character.isWhitespace(c1[i]);
			    if(b3 == true)
			    {
			    	countofwhitespaces++;
			    }
		    }

		    System.out.println("Alphabetes: "+countofalphabet);
		    System.out.println("Digits: "+countofdigit);
		    System.out.println("WhiteSpaces: "+countofwhitespaces);
		    
		    int countofSpecialcharacter = c1.length - (countofwhitespaces+countofdigit+countofalphabet);
		    System.out.println("Special Charaters: "+countofSpecialcharacter);
        }
	}
}
