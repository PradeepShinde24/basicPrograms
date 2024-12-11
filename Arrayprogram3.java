package basicsprograms;
import java.util.Scanner;
import java.util.Arrays;

public class Arrayprogram3
{
	public static void main(String[] args)
	{
		int rollno [] = new int [4];
		int rollno1 [] = new int [4];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the value of rollno and rollno1");
		for(int i = 0; i<4; i++)
		{
			rollno [i] = sc.nextInt();
			rollno1 [i] = sc.nextInt();
		}
		
		System.out.println(Arrays.toString(rollno));
		System.out.println(Arrays.toString(rollno1));
		
		boolean answer = Arrays.equals(rollno, rollno1);
		if(answer == true)
		{
			System.out.println("The 2 arrays are equal");
		}
		else
		{
			System.out.println("The 2 arrays are NOT equal");
		}
		
	}
}
