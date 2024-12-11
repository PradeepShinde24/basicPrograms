package basicsprograms;

public class TryCatchBlock
{
	public static void main(String[] args)
	{
		try
		{
			int c = 1/0;       // c = a/b;      a-> parent class and b-> grand parent class
//			int c = 1/1;
			System.out.println(c);
		}
		catch(ArithmeticException m1)
		{
			System.out.println("Sorry, there was a exception, we have handled it");
		}
		
		
	}
}
