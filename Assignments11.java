package assigments;
import java.util.Scanner;

public class Assignments11
{
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter the student ID: ");
		int Student_ID = sc.nextInt();
		
		System.out.println("Enter the student Name: ");
		String Name = sc.next();
		
		System.out.println("Enter the student College Name: ");
		String College_Name = sc.next();
		
		System.out.println("Enter the student Branch Name: ");
		String Branch_Name = sc.next();
		
		System.out.println("Enter the student Phone Number: ");
		double Phone_No = sc.nextDouble();
		
		System.out.println("Student ID: "+Student_ID);
		System.out.println("Student Name: "+Name);
		System.out.println("College Name: "+College_Name);
		System.out.println("Branch Name: "+Branch_Name);
	}
	
	
	
	
}
