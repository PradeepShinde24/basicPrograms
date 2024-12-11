package basicsprograms;

class One1
{
	One1(int a, int b)
	{
		System.out.println("Constructor 3");
	}
}

class Two2 extends One1
{
	Two2()
	{
		super(2, 4);         // in case of parameterized constructor we have to write the super keyword explicitly
		System.out.println("Constructor 2");
	}
}

public class SuperKeyword extends Two2
{
	SuperKeyword()
	{
		super();   // super calling statement
		System.out.println("Constructor 1");
	}
	
	public static void main(StringFunction[] args)
	{
		new SuperKeyword();
	}
}
