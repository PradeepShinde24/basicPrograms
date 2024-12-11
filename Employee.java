package basicsprograms;

public class Employee
{
	Employee(String employee_Name)
	{
		this("Sr Sales Associate", 62000.32);
		String name = employee_Name;
		System.out.println("Employee Name is: "+name);
	}
	
	Employee(int employee_ID, String employee_Company)
	{
		int eID = employee_ID;
		String empc = employee_Company;
		System.out.println("Employee ID is: "+eID);
		System.out.println("Employee Company Name is: "+empc);
	}
	
	Employee(String Designation, double Salary )
	{
		this(32, "Amazon");
		String des = Designation;
		double sal = Salary;
		System.out.println("Employee Designation is:"+" "+des);
		System.out.println("Employee Salary is:"+" "+sal);
	}
	
	public static void main(String[] args)
	{
		Employee e1 = new Employee("Pradeep");
		Employee e2 = new Employee(631, "XYZ Technologies");
		Employee e3 = new Employee("SQA, 65000.00");
	}
}
