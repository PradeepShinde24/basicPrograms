package assigments;

public class Assignments12
{
	int num1 = 2421;         //  global variable
	
	final int num2 = 24;   // final variable
	
	public void variable()
	{
	    int num3 = 30;     // local variable
		
	    num3 = 50;         // we can change the value of local variable
		num1 = 2472;       // we can change the value of global variable 
		
		// But in case of final variable we can not change the value it gives the compile error
//		final num2 = 54;

		System.out.println("Num1 = " +num1);
		System.out.println("Num2 = "+num2);
		System.out.println("Num1 = " +num3);

	}
	
	public static void main(String args [])
	{
		Assignments12 obj = new Assignments12();
		obj.variable();
	}
}
