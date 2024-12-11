package basicsprograms;

abstract class Google_Auth
{
	abstract void login();
	abstract void logout();
}

public class Facebook_Login extends Google_Auth
{
	void login()
	{
		System.out.println("Logic by Developer");
	}
	
	void logout()
	{
		System.out.println("Logic by Developer 1");
	}
	
	public static void main(String [] args)
	{
		Facebook_Login f1 = new Facebook_Login();
		f1.login();
		f1.logout();
	}

	
}
