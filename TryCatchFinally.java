package basicsprograms;

public class TryCatchFinally
{
	public static void main(String[] args)
	{
		try
		{
			int c = 1/0;
//			int c = 1/1;
			System.out.println("Try Block");
		}
		catch(ArithmeticException a1)
		{
			System.out.println("Catched it");
		}
		finally
		{
			System.out.println("Finally Block");
		}
		
		
	}
}
