package inheritance;

import java.util.Scanner;

class alpha
{
	void fun1()
	{
	System.out.println("CONNECTION ESTLABLISHED4");
	Scanner scan =new Scanner(System.in);
	int a=scan.nextInt();
	int b=scan.nextInt();
	int res=a/b;
	scan.close();
	System.out.println(res);
	System.out.println("CONNECTION TERMINATED4");

	}
}
class beta 
{
	void fun2()
	{
		System.out.println("CONNECTION ESTLABLISHED3");
		try {
		
		alpha obj=new alpha();
		obj.fun1();
		
			}
		catch(Exception e)
		{
			System.out.println("Exception Handled in Beta One");
		}
	System.out.println("CONNECTION TERMINATED3");
	}
}
class gamma 
{
	void fun3()
	{
		System.out.println("CONNECTION ESTLABLISHED2");
		beta obj=new beta();
		obj.fun2();
		System.out.println("CONNECTION TERMINATED2");
	}
}

public class SuclassExcept {
	public static void main(String args[])
	{
		System.out.println("CONNECTION ESTLABLISHED1");
		gamma obj=new gamma();
		obj.fun3();
		System.out.println("CONNECTION TERMINATED1");
		
	}

}
