package inheritance;

import java.util.Scanner;
class InvalidPinException extends Exception
{
	@Override
	public String getMessage() {
		return "See How Many Times U Wrongly Entered Pin Stupid";
	}
}
class Atm
{
	int pin=1234;
	int cpin;
	void acceptInput()
	{
	System.out.println("Enter Your Pin:");
	Scanner scan=new Scanner(System.in);
	cpin=scan.nextInt();
	}
	public void verify() throws Exception
	{
	if(pin==cpin)
	{
		System.out.println("Collect Your Money");
	}
	else
	{
		System.out.println("Invalid Pin");
		InvalidPinException ipe=new InvalidPinException();
		throw ipe;
		
	}
	}

}
class Bank
{
	void init()
	{
		Atm obj=new Atm();
		try {
		obj.acceptInput();
		obj.verify();
		}
		catch(Exception e)
		{try
		{
			obj.acceptInput();
			obj.verify();
		}
		catch(Exception f)
		{
			try
			{
			obj.acceptInput();
			obj.verify();
			}
			catch(Exception g)
			{
				System.out.println(g.getMessage());
				g.printStackTrace();
				
			}
		}
		}
	}
}

public class customException {
	public static void main(String args[])
	{
		Bank obj=new Bank();
				obj.init();
	}

}
