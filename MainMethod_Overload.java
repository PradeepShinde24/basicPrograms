package basicsprograms;

public class MainMethod_Overload
{
	public static void main(String[] args)
	{
		main();
		main("Pradeep");
		main(10,9);
	}
	
	public static void main()
	{
		System.out.println("We can overload the main method");
	}
	public static void main(String name)
	{
		System.out.println(name);
	}
	public static void main(int a, int b)
	{
		System.out.println(a + " " +b);
	}
}
