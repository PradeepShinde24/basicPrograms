package basicsprograms;

public class NonstaticMethod
{
	void add()      
	{
		int a = 100;
		int b = 200;
		int c = a+b;
		System.out.println(c);
	}
	
	void sub()
	{
		int a = 1000;
		int b = 200;
		int c = a-b;
		System.out.println(c);
	}
	
    void mul()
	{
		int a = 10;
		int b = 2;
		int c = a*b;
		System.out.println(c);
	}
    
	public static void main(StringFunction[] args)
	{
		NonstaticMethod n1 = new NonstaticMethod();
//		classname variable = new classname();
//		variable.non-static method name;
		
		n1.add();
		n1.sub();
		n1.mul();
	}
}

