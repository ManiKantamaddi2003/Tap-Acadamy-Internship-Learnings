package multiThreading;
class Hero11 extends Thread
{
	@Override
	public void run() {
		try
		{
			Thread t=Thread.currentThread();
			t.setName("Main");
			Lightmen11 obj=new Lightmen11();
			Mackupmen11 obj1=new Mackupmen11();
			obj1.setDaemon(true);
			obj.setDaemon(true);
			obj.start();
			obj1.start();
			for(int i=0;i<5;i++)
			{
				System.out.println("Current Thread Name: "+t.getName()+" Is Executing ");
				Thread.sleep(3000);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
class Lightmen11 extends Thread
{
	@Override
	public void run() {
		Thread t=Thread.currentThread();
		t.setName("DaemonThread-1");
		try
		{
			for(;;)
			
			{
				System.out.println("Current Thread Name: "+t.getName()+" Is Executing ");
				Thread.sleep(3000);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
class Mackupmen11 extends Thread
{
	@Override
	public void run() {
		Thread t=Thread.currentThread();
		t.setName("DaemonThread-2 ");
		try
		{
		for(;;)
		{

			System.out.println("Current Thread Name: "+t.getName()+" Is Executing ");
			Thread.sleep(3000);
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

public class DaemonExample3 {
	public static void main(String args[])
	{
		Hero11 obj=new Hero11();
		obj.start();
		
	}
}

