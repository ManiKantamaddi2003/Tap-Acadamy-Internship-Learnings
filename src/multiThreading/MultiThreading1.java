package multiThreading;
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
	}
}
public class MultiThreading1 {
	public static void main(String args[])
	{
		Numbers obj=new Numbers();
		obj.start();
		
	}

}
