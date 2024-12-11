package basicsprograms;
import java.util.Arrays;
import java.util.Scanner;

public class Arrayprogram2
{
	public static void main(String[] args)
	{
		String name [] = new String[3];
		
		Scanner sc = new Scanner(System.in);
//		name[0] = sc.next();
//		name[1] = sc.next();
//		name[2] = sc.next();
		
		for(int i = 0; i<name.length; i++)
		{
			name[i] = sc.next();
		}
		
		System.out.println(Arrays.toString(name));
	}
}
