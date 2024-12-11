package basicsprograms;

public class Arrayprogram6
{
	public static void main(String[] args)
	{
		double salary [] = new double [4];
		salary[0] = 8745; 
		salary[1] = 9745;
		salary[2] = 6745;
		salary[3] = 5745;
		double sum = 0;
		double average = 0;
		
		for(int i = 0; i<4; i++)
		{
			sum = sum + salary[i];
		}
		System.out.println("Sum is:"+sum);
		
		average = sum / (salary.length);
		System.out.println("Average is:"+average);
		
	}
}
