package basicsprograms;

abstract class ClassB
{
	abstract void login();
	abstract void logout();
	
	static void authorization()
	{
		System.out.println("Logic written by the developer to access the API");
	}
	
	static void db_read()
	{
		System.out.println("Logic writeen by developer to access the DB");
	}
}

public class ClassA extends ClassB
{
	void login()
	{
		
	}

	void logout()
	{
		
	}
	
	public static void main(StringFunction[] args)
	{

	}

}
