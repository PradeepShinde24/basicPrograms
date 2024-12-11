package basicsprograms;
import java.util.Arrays;

public class Arrayprogram4
{
	public static void main(String[] args)
	{
		int [] a1 = new int[5];
		a1[0] = 74;
		a1[1] = 96;
		a1[2] = 34;
		a1[3] = 41;
		a1[4] = 42;
		System.out.println(Arrays.toString(a1));
		
		int numbertocheck = 34;
		
		for(int i = 0; i<a1.length; i++)
		{
			if(numbertocheck == a1[i])
			{
				System.out.println("The given number is the part of the array");
				System.out.println("The indexing of that number is: "+i);
			}
		}
		
		
	}
}
