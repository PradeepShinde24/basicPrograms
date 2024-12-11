package basicsprograms;

public class Automation
{
	Automation(double pi)
	{
		System.out.println("This is my constructor 4");
	}
	Automation(double pi, int radius)
	{
		System.out.println("This is my constructor 5");
	}
	Automation()
	{
		System.out.println("This is my constructor 1");
	}
	Automation(String a)
	{
		System.out.println("This is my constructor 2");
	}
	Automation(boolean a)
	{
		System.out.println("This is my constructor 3");
	}
	
	// Constructor Overloading
	
	public static void main(String [] args)
	{
		/*
		Automation a1 = new Automation();
		Automation a2 = new Automation("Pradeep");
		Automation a3 = new Automation(false);
		Automation a4 = new Automation(3.14);
		Automation a5 = new Automation(3.14, 7);
		*/
		
		// other way to create an object of constructor
	
		new Automation();
		new Automation("Pradeep");
		new Automation(false);
		new Automation(3.14);
		new Automation(3.14, 7);
	}
}
