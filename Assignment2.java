package assigments;

public class Assignment2
{
	static void add()
	{
		int a = 100;
		int b = 200;
		int c = a+b;
		System.out.println(c);
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
		int c = a*b;
		System.out.println(c);
	}
    
    void div()
	{
		int a = 10;
		int b = 2;
		int d = a/b;
		System.out.println(d);
	}
    
    void mod()
	{
		int a = 11;
		int b = 2;
		int e = a%b;
		System.out.println(e);
	}
    

	public static void main(String[] args)
	{
		add();
//		Assignment2.add();      // other way to create object of the static method
		sub();
		mul();
		
		Assignment2 n1 = new Assignment2();
//		classname variable = new classname();
//		variable.non-static method name;
		
		n1.div();
		n1.mod();
		
	}
}
