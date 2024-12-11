package basicsprograms;

public class MethodOverloading
{
	static void add()
	{
		System.out.println("Addition");
	}
	void add(int a)
	{
		int c = a+6;
		System.out.println(c);
	}
	static void add(int a, int b)
	{
		int c = a+b;
		System.out.println(c);
	}
	static void add(int a, double b)
	{
		double c = a+b;
		System.out.println(c);
	}
	
	public static void main(StringFunction[] args)
	{
		add();
//		MethodOverloading.add();         // another way to create the object of static method
		
		MethodOverloading m1 = new MethodOverloading();      // non static method
		m1.add(100);
		
		add(100, 200);
		add(100, 9.90);
	}
}
