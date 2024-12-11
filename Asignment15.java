package assigments;
import java.util.Scanner;

public class Asignment15
{
	public static void main(String args [])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the age: ");
		int age = sc.nextInt();
		
		assert(age >= 0 && age<= 65) : "Please put correct input age is invalid";
		
		System.out.println("Age is: "+age);
	}
}
