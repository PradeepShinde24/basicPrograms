package basicsprograms;
import java.util.Scanner;


public class Scanner_Class {

	public static void main(StringFunction[] args)
	{
		Scanner s1 = new Scanner(System.in);
//		String name = s1.next();
		
		System.out.println("Please Enter the value of a:");
		int a = s1.nextInt();
		System.out.println("Please Enter the value of b:");
		int b = s1.nextInt();
		
		int sum = a+b;
		System.out.println("The sum of two number is:"+sum);
		System.out.println(sum);
	}

}
