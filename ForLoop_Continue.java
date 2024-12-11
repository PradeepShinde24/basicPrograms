package basicsprograms;

public class ForLoop_Continue
{
	public static void main(String [] args)
	{
		for(int i = 1; i<11; i++)
		{
			if(i >= 4)
			{
				continue;
			}
			System.out.println(i);
		}
	}

}
