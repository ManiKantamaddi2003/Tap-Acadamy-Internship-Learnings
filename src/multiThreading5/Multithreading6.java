package multiThreading5;
import java.util.Scanner;

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
class Add extends Thread
{
	@Override
	public void run() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Addition  Started");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int c=a+b;
		System.out.println(c);
		scanner.close();
		System.out.println("Addition Ended");
	}
}
class Sub extends Thread
{
	@Override
	public void run() {
		
		System.out.println("Subtraction  Started");
		int ab=100;
		int bc=50;
		int c=ab-bc;
		System.out.println(c);
		
		System.out.println("Subtraction Ended");
	}
}

class Mul extends Thread
{
	@Override
	public void run() {
		
		System.out.println("Mutiplication  Started");
		int ab=100;
		int bc=50;
		int c=ab*bc;
		System.out.println(c);
		
		System.out.println("Multiplication Ended");
	}
}

public class Multithreading6 {
	public static void main(String args[])
	{
		
		Numbers obj1=new Numbers();
		Letters obj2=new Letters();
		Sletters obj3=new Sletters();
		Add obj4=new Add();
		Sub obj5=new Sub();
		Mul obj6=new Mul();
		
		obj1.start();
		obj2.start();
		obj3.start();
		obj4.start();
		obj5.start();
		obj6.start();
	}

}
