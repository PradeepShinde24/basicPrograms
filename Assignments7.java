package assigments;

public class Assignments7
{
	void addition(int a, int b)
	{
		int result = a + b;
		System.out.println("Addition of two int number is : "+result);
	}
	
	void addition(int a, double b)
	{
		double result = a + b;
		System.out.println("Addition is : "+result);
	}
	
	void addition(double a, double b)
	{
		double result = a + b;
		System.out.println("Addition of two float number is : "+result);
	}
	
	void addition(String a, String b)
	{
		String result = a + b;
		System.out.println("Addition of two float number is : "+result);
	}
	
	public static void main(String[] args)
	{
		Assignments7 a1 = new Assignments7();
		a1.addition(15, 7);
		a1.addition(24, 2450);
		a1.addition(3.4, 7.4);
		a1.addition("Pradeep", " Shinde");
	}
}
