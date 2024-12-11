package assigments;

public class Assignment4
{
	public static void main(String[] args)
	{
		int a = 120;
		
		if(a>=90 && a<= 100)
		{
			System.out.println("Grade is A++");
		}
		else if(a>=80 && a<90)
		{
			System.out.println("Grade is A");
		}
		else if(a>=70 && a<80)
		{
			System.out.println("Grade is B");
		}
		else if(a>=60 && a<70)
		{
			System.out.println("Grade is C");
		}
		else if(a>=50 && a<60)
		{
			System.out.println("Grade is D");
		}
		else if(a>100)
		{
			System.out.println("Invalid marks");
		}
		else
		{
			System.out.println("Grade is FAIL");
		}
	}

}
