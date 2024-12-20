package inheritance;

import java.util.Scanner;

class alpha1
{
	void fun1()throws Exception
	{
	System.out.println("CONNECTION ESTLABLISHED 2");
	try {
	Scanner scan =new Scanner(System.in);
	int a=scan.nextInt();
	int b=scan.nextInt();
	int res=a/b;
	scan.close();
	System.out.println(res);
	}
	catch(Exception e)
	{
		System.out.println("I CANT HANDLE PLEASE HANDLE MAIN()");

		throw e;
	}
	System.out.println("CONNECTION TERMINATED 2");

	}
}
public class RethrowingExcep {
	public static void main(String args[]) {
		System.out.println("CONNECTION ESTLABLISHED1");
		try {
		alpha1 obj=new alpha1();
		obj.fun1();
		}
		catch(Exception e)
		{
			System.out.println("EXCEPTION HANDLED BY MAIN");
		}
		System.out.println("CONNECTION TERMINATED1");
		
	}

}
