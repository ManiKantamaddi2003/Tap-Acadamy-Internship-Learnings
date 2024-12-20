package multiThreading;
class alpha1 implements Runnable
{
	@Override
	public void run() {
		System.out.println("PRINTING NUMBERS STARTED");
		Thread t=Thread.currentThread();
		t.setPriority(1);
		for(int i=0;i<5;i++)
		{
			System.out.println("NAME OF THE THREAD: "+t.getName()+"PRIORITY OF THE THREAD"+ t.getPriority()+ "Thread is alive?: "+t.isAlive()+" EXECUTING ITS:" +i);
			
			try
			{
//				t.join();
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

class beta1 implements Runnable
{
	@Override
	public void run() {
		System.out.println("PRINTING LETTERS STARTED");
		Thread t=Thread.currentThread();
		t.setPriority(2);
		for(int i=65;i<70;i++)
		{
			System.out.println("NAME OF THE THREAD: "+t.getName()+"PRIORITY OF THE THREAD: "+t.getPriority()+"Thread is alive?: "+t.isAlive()+" EXECUTING ITS:" +(char)i);
			try
			{
//				t.join();
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
public class Threadstate {
	public static void main(String args[])
	{
		System.out.println("MAIN THREAD EXECUTING");
		alpha1 obj1=new alpha1();
		beta1 obj2=new beta1();
		Thread obj=new Thread(obj1);
		Thread obj3=new Thread(obj2);
		obj.start();
		obj3.start();
		System.out.println( obj.getName()+"is alive:? "+obj.isAlive());
		System.out.println( obj3.getName()+"is alive:? "+obj3.isAlive());
		
		System.out.println("MAIN THREAD EXECUTION STOPED");
		
	}

}
