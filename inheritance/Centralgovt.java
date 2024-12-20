package inheritance;

import java.util.Scanner;
class UnderAgeException extends Exception
{
	@Override
	public String getMessage() {
		return "Play With Toys";
	}
}
class OverAgeException extends Exception
{
	@Override
	public String getMessage() {
		return "Take REst If Not Rest In Peace";
	}
}

class Rto
{
	int age;
	public void check()
	{
	System.out.println("Enter Ur Age:");
	Scanner scan=new Scanner(System.in);
	age=scan.nextInt();
	
	}
	public void validate() throws UnderAgeException,OverAgeException
	{
		if(age>=18 && age<=60)
		{
			System.out.println("Okay Proceed");
		}
		else if(age<18)
		{
			System.out.println("Wait Some More Years Kid");
			UnderAgeException ue=new UnderAgeException();
			throw ue;
		}
		else
		{
			System.out.println("You are Too Late");
			OverAgeException oe=new OverAgeException();
			throw oe;
		}
	}
	
}
class Stategov
{
	void initiate()
	{
		Rto okay=new Rto();
		try
		{
		okay.check();
		okay.validate();
		}catch(Exception e)
		{
			try
			{
			okay.check();
			okay.validate();
			}catch(Exception f)
			{
				try
				{
				okay.check();
				okay.validate();
				}catch(Exception g)
				{
					System.out.println(g.getMessage());
					g.printStackTrace();
				}
			}
			
		}
	}
	
}
public class Centralgovt {
	public static void main(String args[])
	{
		Stategov allow=new Stategov();
		allow.initiate();
	}

}
