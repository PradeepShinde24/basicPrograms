package basicsprograms;

public class GlobalVariable
{
	static int a = 100;
	static int b = 200;
	int c = 10;
	
	static void add()
	{
		a = 50;          // here we can update the value of global variable in the case of static
		int sum = a+b;
		System.out.println(sum);
	}
	static void sub()
	{
		int sub = a-b;
		System.out.println(sub);
	}
	
	public static void main(StringFunction[] args)
	{
		add();
		sub();
//		a = 1;       // also here we can update the value of global variable in the case of static
	
		GlobalVariable g1 = new GlobalVariable();  
		g1.c = 100;     // here we update the value of global variable in the case of non static 
		
	}
}
