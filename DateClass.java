package basicsprograms;
import java.util.Date;
import java.util.Scanner;

public class DateClass
{
	public static void main(String[] args)
	{
		Date d1 = new Date();
		System.out.println(d1.getTime());
		
		Date d2 = new Date(d1.getTime()+(1000*60*60*24*3));       // here we can change the + and - for future and past days
		System.out.println(d2);
		
		String input = d2.toString();
		String month = input.substring(4, 7);
		System.out.println(month);
		
		String date = input.substring(8, 10);
		System.out.println(date);
		
		String year = input.substring(input.length()-4);
		System.out.println(year);
		
		System.out.println(date.concat(month).concat(year));
		System.out.println(date.concat(" ").concat(month).concat(" ").concat(year));
		System.out.println(date.concat("-").concat(month).concat("-").concat(year));
		System.out.println(date.concat("/").concat(month).concat("/").concat(year));
	}
}
