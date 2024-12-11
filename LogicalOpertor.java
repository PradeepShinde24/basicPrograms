package basicsprograms;

public class LogicalOpertor
{
	public static void main(StringFunction[] args)
	{
		int age = 18;
		char gender = 'M';
/*		
		if(age>=18 && gender =='F')
		{
			System.out.println("Both are satisfied in AND");
		}
*/	
		
		if(age>=56 || gender =='C')
		{
			System.out.println("Both are satisfied in OR");
		}
		
		if(!(age>=56 || gender =='C'))
		{
			System.out.println("Both are satisfied in OR with NOT");
		}
		
		if(!(age>=18 && gender =='C'))
		{
			System.out.println("Both are satisfied in AND with NOT");
		}
	}
}
