package multiThreading2;
class Numbers extends Thread
{
	@Override
	public void run() {
		System.out.println("Printing Numbers Started");
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
		System.out.println("Printing Numbers Ended");
	}
}
class Letters extends Thread
{
	@Override
	public void run() {
		System.out.println("Printing Alphabets Started");
		for(int i=65;i<=70;i++)
		{
			System.out.println((char)i);
			
			try
			{
				Thread.sleep(3000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("Printing Alphabets Ended");
		
	}
}
class Sletters extends Thread
{
	@Override
	public void run() {
		System.out.println("Printing Small Alphabets Started");
		for(int i=97;i<=100;i++)
		{
			System.out.println((char)i);
			
			try
			{
				Thread.sleep(3000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("Printing Small Alphabets Ended");
		
	}
}
public class Multithreading3 {
	public static void main(String args[])
	{
		Numbers obj1=new Numbers();
		Letters obj2=new Letters();
		Sletters obj3=new Sletters();
		obj1.start();
		obj2.start();
		obj3.start();
	}

}
