package assigments;

public class Assignments6_Employee
{
	String employeeName;
	int employeeID;
	String companyName;
	String designation;
	double salary;
			
	Assignments6_Employee(String employeeName)
	{
//		this.employeeName = employeeName;
//		System.out.println("EmployeeName: "+employeeName);
		
		String empName = employeeName;       // both syntax output is same
		System.out.println("Employee Name: "+empName);
	}
	
	Assignments6_Employee(int employeeID, String companyName)
	{
		this.employeeID = employeeID;
		this.companyName = companyName;
		
		System.out.println("Employee ID: "+employeeID);
		System.out.println("Company Name: "+companyName);
	}
	
	Assignments6_Employee(String designation, int salary)
	{
		this.designation = designation;
		this.salary = salary;
		
		System.out.println("Designation: "+designation);
		System.out.println("Salary: "+salary);
	}
		
	public static void main(String[] args)
	{
		/*
		Assignments6_Employee ae1 = new Assignments6_Employee("Pradeep Namdev Shinde"); 
		Assignments6_Employee ae2 = new Assignments6_Employee(1, "ABC"); 
		Assignments6_Employee ae3 = new Assignments6_Employee("XYZ", 500000); 
		*/
		
		// other syntax    (this one is preferable syntax )

		new Assignments6_Employee("Pradeep Namdev Shinde"); 
		new Assignments6_Employee(1, "ABC"); 
		new Assignments6_Employee("XYZ", 500000);	
	}
}
