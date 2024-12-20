package multiThreading;

import java.util.Scanner;

class Demo extends Thread
{
	@Override
	public void run() {
		Thread t=Thread.currentThread();
		String s=t.getName();
		if(s.equals("main"))
		{
			alpha();
		}
		else if(s.equals("Thread-1"))
		{
			beta1();
		}
		else if(s.equals("Thread-2"))
		{
			gaama();
		}
		else if(s.equals("Thread-3"))
		{
			sigma();
		}
	}
	public void alpha() {
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
				Thread t=currentThread();
				System.out.println(t.getName());
			}
		}
		System.out.println("Printing Numbers Ended");
	}
	
	public void beta1() {
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
	
	public void gaama() {
		System.out.println("Printing Small Alphabets Started");
		for(int i=97;i<=100;i++)
		{
			System.out.println((char)i);
			
			try
			{
				Thread.sleep(3000);
			}catch(Exception e)
			{
				Thread t=currentThread();
				System.out.println(t.getName());
			}
		}
		System.out.println("Printing Small Alphabets Ended");
		
	}
	public void sigma()
	{
		
		System.out.println("Division Started");
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		scan.close();
		int res=a/b;
		System.out.println(res);
		
		
	}
}


public class SingleRunMethod {
	public static void main(String args[])
	{
		Demo obj1=new Demo();
		Demo obj2=new Demo();
		Demo obj3=new Demo();
		Demo obj4=new Demo();
		obj1.setName("main");
		obj2.setName("Thread-1");
		obj3.setName("Thread-2");
		obj4.setName("Thread-3");
		obj1.start();
		obj2.start();
		obj3.start();
		obj4.start();
	}

}
