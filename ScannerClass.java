package basicsprograms;
import java.util.Scanner;

public class ScannerClass
{
	public static void main(String [] args)
	{
		Scanner s1 = new Scanner(System.in);
		
		String name = s1.next();
		int no1 = s1.nextInt();
		byte no2 = s1.nextByte();
		short no3 = s1.nextShort();
		long no4 = s1.nextLong();
		double no5 = s1.nextDouble();
		float no6 = s1.nextFloat();
		boolean no7 = s1.nextBoolean();
	}
}
