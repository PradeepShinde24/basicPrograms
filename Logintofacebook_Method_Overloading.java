package basicsprograms;

public class Logintofacebook_Method_Overloading
{
	static void login(String emailid)
	{
		System.out.println("Here i will write the logic to login facebook by using email id");
	}
	
	static void login(long mobileno)
	{
		System.out.println("Here i will write the logic to login facebook by using mobile number");
	}
	
	public static void main(String[] args)
	{
		login("pradeepshinde2001@gmail.com");
		login(9049311921l);
	}
}
