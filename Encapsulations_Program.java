package basicsprograms;


class Amazon_Program
{
	private String emailid = "pradeep.21910955@viit.ac.in";
	public String getEmailid()
	{
		return emailid;
	}
	public void setEmailid(String emailid)
	{
		this.emailid = emailid;
	}
	
	private int age = 18;
		
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
}


/*
// directly access by the click right button and click on source there is Generate Getter and Setter option click on it we can create the directly create the getter and setter methods
public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
*/


public class Encapsulations_Program
{
	public static void main(String[] args)
	{
		Amazon_Program a1 = new Amazon_Program();
		a1.setEmailid("pradeepshinde2001@gmail.com");
		System.out.println("Email ID: "+a1.getEmailid());
		
		a1.setAge(32);
		System.out.println("Age: "+a1.getAge());
	}
}




