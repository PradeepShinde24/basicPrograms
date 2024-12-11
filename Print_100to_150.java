package basicsprograms;

public class Print_100to_150
{
	public static void main(StringFunction[] args) throws InterruptedException
	{
		for(int i =-100; i>=-150; i--)
		{
			System.out.println("Range of i between -100 to -150: " +i);
			Thread.sleep(100);   
		}
	}

}
