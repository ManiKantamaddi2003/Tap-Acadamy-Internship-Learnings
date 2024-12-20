package multiThreading;

class alpha implements Runnable
{
	@Override
	public void run() {
		System.out.println("PRINTING NUMBERS STARTED");
		for(int i=0;i<5;i++)
		{
			System.out.println(i);
			try
			{
			Thread.sleep(2000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("PRINTING NUMBERS Ended");
		
	}
}

class beta implements Runnable
{
	@Override
	public void run() {
		System.out.println("PRINTING LETTERS STARTED");
		for(int i=65;i<70;i++)
		{
			System.out.println((char)i);
			try
			{
			Thread.sleep(2000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("PRINTING LETTERS Ended");
		
	}
}
public class RunnableExample {
	public static void main(String args[])
	{
		alpha obj1=new alpha();
		beta obj2=new beta();
		Thread obj=new Thread(obj1);
		Thread obj3=new Thread(obj2);
		obj.start();
		obj3.start();
		
	}

}
