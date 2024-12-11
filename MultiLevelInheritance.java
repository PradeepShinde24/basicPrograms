package basicsprograms;

class One
{
	static void add()
	{
		
	}
	
}

class Two extends One
{
	static void sub()
	{
		
	}
}

public class MultiLevelInheritance extends Two
{
	static void mul()
	{
		
	}
	
	public static void main(StringFunction[] args)
	{
		mul();
		sub();
		add();
	}
}
