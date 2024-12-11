package basicsprograms;

class ParentClass1
{
	void login()
	{
		System.out.println("Login with Mobile Number");
	}
}

public class AbstractClass extends ParentClass1
{
	void login()
	{
		System.out.println("Login with Email Id");
		super.login();
	}
	
	public static void main(String [] args)
	{
		AbstractClass a1 = new AbstractClass();
		a1.login();	
	}
}
