package basicsprograms;
import java.util.Scanner;

public class SwitchCaseProgram
{
	public static void main(StringFunction[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Press 1 for Chrome");
		System.out.println("Press 2 for IE");
		System.out.println("Press 3 for firefox");
		System.out.println("Press 4 for Safari");
		System.out.println("Press 5 for Edge");
		int input = sc.nextInt();
		
		switch(input)
		{
		case 1:
			System.out.println("Launching Chrome Browser");
			break;
			
		case 2:
			System.out.println("Launching IE Browser");
			break;
			
		case 3:
			System.out.println("Launching firefox Browser");
			break;
			
		case 4:
			System.out.println("Launching Safari Browser");
			break;
			
		case 5:
			System.out.println("Launching Edge Browser");
			break;
			
		default:
			System.out.println("Please enter 1,2,3,4 or 5 only");
		}
	}

}
