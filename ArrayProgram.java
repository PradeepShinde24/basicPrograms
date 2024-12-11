package basicsprograms;
import java.util.Arrays;

public class ArrayProgram
{
	public static void main(String args [])
	{
		int rollno[] = new int[3];
		rollno[0] = 74;
		rollno[1] = 85;
		rollno[2] = 12;
        // declaration and initialization	
		
		/*
		for(int i = 0; i<3; i++)
		{
			System.out.println(rollno[i]);
		}
		*/
		System.out.println(Arrays.toString(rollno));
		
		
		String name [] = new String[4];
		name[0] = "ram";
		name[1] = "sita";
		name[2] = "laxman";
		name[3] = "bhim";
		
		/*
		for(int i = 0; i<4; i++)
		{
			System.out.println(name[i]);
		}
		*/
		System.out.println(Arrays.toString(name));
		
		
		char surname[] = new char[4];
		surname[0] = 'Z';
		surname[1] = 'A';
		surname[2] = 'I';
		surname[3] = 'R';
		
		System.out.println(Arrays.toString(surname));
	}
}