package assigments;

public class Assignments8
{
	static void addition(int a, int b)
	{
		int result = a + b;
		System.out.println("Addition of two int number is : "+result);
	}
	
	static void addition(int a, double b)
	{
		double result = a + b;
		System.out.println("Addition is : "+result);
	}
	
	static void addition(double a, double b)
	{
		double result = a + b;
		System.out.println("Addition of two float number is : "+result);
	}
	
	static void addition(String a, String b)
	{
		String result = a + b;
		System.out.println("Addition of two float number is : "+result);
	}
	
	public static void main(String[] args)
	{
		addition(15, 7);
		addition(24, 2450);
		addition(3.4, 7.4);
		addition("Pradeep", " Shinde");
	}
}
