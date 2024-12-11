package basicsprograms;

public class This_Keyword
{
	int age1;
	String name;
	double salary;
	void student_details(int age, String name, double salary)
	{
		// this.global variable = local variable;
		// this keyword can only be used in the non static context
		this.age1 = age;
		this.name = name;
		this.salary = salary;
	}
	
	public static void main(String[] args)
	{
		This_Keyword t1 = new This_Keyword();
		t1.student_details(45, "ram", 8574.32);
		
		System.out.println(t1.age1);     // 0    if "this" keyword not used then output is 0, NULL, 0.0
		System.out.println(t1.name);    // NULL
		System.out.println(t1.salary);  // 0.0
	}
}
