package basicsprograms;

public class Throw_Keyword
{
	public static void main(String args[]) throws NullPointerException
	{
		if(2<3)
		{
			throw new NullPointerException("Sorry but the file is empty");
		}
		else
		{
			throw new ArithmeticException();
		}
	
	}
}
