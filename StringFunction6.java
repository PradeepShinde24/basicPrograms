package basicsprograms;
import java.util.Arrays;

public class StringFunction6
{
	public static void main(String[] args)
	{
		String name = "pradeep namdev shinde";
		
		String a1 [] = name.split(" ");
		System.out.println(Arrays.toString(a1));
		
		String a2 [] = name.split(" ", 2);
		System.out.println(Arrays.toString(a2));
	}
}
