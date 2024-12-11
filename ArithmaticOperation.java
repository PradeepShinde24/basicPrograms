package basicsprograms;

public class ArithmaticOperation
{
	static void add()        // Default access specifier 
	{
		int a = 100;     // local variable
		int b = 200;     // local variable
		int sum = a+b;   // local variable
		System.out.println(sum);
	}
	
	static void sub()
	{
		int a = 1000;               
		int b = 200;
		int c = a-b;
		System.out.println(c);
	}
	
	static void mul()
	{
		int a = 10;
		int b = 2;
		int d = a*b;
		System.out.println(d);
	}
	
	static void div()
	{
		double a = 100;
		double b = 3;
		double e = a/b;
		System.out.println(e);
	}
	
	static void mod()
	{
		int a = 13;
		int b = 7;
		int mod = a%b;
		System.out.println(mod);
	}
	
	public static void main(StringFunction[] args)
	{
		add();
//		ArithmaticOperation.add();        // we can also call add method in this syntax
		sub();
		mul();
		div();
		mod();
	}
}
