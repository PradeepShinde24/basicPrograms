package basicsprograms;


class Student
{
	void login()
	{
		System.out.println("Student Login");
	}
}


public class Method_Overriding extends Student
{
	void login()
	{
		System.out.println("Teacher Login");
	}
	
	public static void main(String[] args)
	{
//		Method_Overriding m1 = new Method_Overriding();
//		m1.login();
		
		Student s1 = new Student();
		s1.login();
	}
}
