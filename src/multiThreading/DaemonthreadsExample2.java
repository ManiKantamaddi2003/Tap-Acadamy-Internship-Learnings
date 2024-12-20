package multiThreading;
class Hero extends Thread
{
	@Override
	public void run() {
		try
		{
			Lightmen obj=new Lightmen();
			Mackupmen obj1=new Mackupmen();
			obj1.setDaemon(true);
			obj.setDaemon(true);
			obj.start();
			obj1.start();
			System.out.println("Hero Entered Into The Shooting");
			Thread.sleep(3000);
			System.out.println("Hero Goes to Make-up Room");
			Thread.sleep(3000);
			System.out.println("Hero Start Acting");
			Thread.sleep(3000);
			System.out.println("Hero Start Practcing Fights");
			Thread.sleep(3000);
			System.out.println("Hero Went Back");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
class Lightmen extends Thread
{
	@Override
	public void run() {
		try
		{
			for(;;)
			
			{
				System.out.println("Lightmen In set");
				Thread.sleep(3000);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
class Mackupmen extends Thread
{
	@Override
	public void run() {
		try
		{
		for(;;)
		{

			System.out.println("MakeupMen In set");
			Thread.sleep(3000);
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

public class DaemonthreadsExample2 {
	public static void main(String args[])
	{
		Hero obj=new Hero();
		obj.start();
		
	}
}
