package inheritance;

import java.util.Scanner;

public class ThreadSleep {
	public static void main(String args[]) 
	{
		try {
			Scanner scan=new Scanner(System.in);
			int n=scan.nextInt();
			int m=scan.nextInt();
			scan.close();
		for(int i=n;i<=m;i++)
		{
			System.out.println((char)i);
			Thread.sleep(1000);
		}
	}
	catch(Exception e)
	{
		System.out.println("hii hello");
	}
	}

}
