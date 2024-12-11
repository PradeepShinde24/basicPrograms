package basicsprograms;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchBlockProgram
{
	public static void main(String[] args)
	{
		try
		{
			Scanner s1 = new Scanner (System.in);
			System.out.print("Please enter the size of your array: ");
			
			int rollno[] = new int[s1.nextInt()];
			System.out.println("Enter the values of array now: ");
			for(int i = 0; i<rollno.length; i++)
			{
				rollno[i] = s1.nextInt();
			}
			System.out.println(Arrays.toString(rollno));      // make list of array elements
		}
		catch(NegativeArraySizeException a1)
		{
			System.out.println("Sorry, there was a problem ......can you enter the size of your array as positive number only");
			Scanner s1 = new Scanner (System.in);
			System.out.print("Please enter the size of your array: ");
			
			int rollno[] = new int[s1.nextInt()];
			System.out.println("Enter the values of array now: ");
			for(int i = 0; i<rollno.length; i++)
			{
				rollno[i] = s1.nextInt();
			}
			System.out.println(Arrays.toString(rollno));      // make list of array elements
		}
		catch(InputMismatchException n1)
		{
			System.out.println("Sorry, but the size of array should be only numeric");
		}
	}
}
