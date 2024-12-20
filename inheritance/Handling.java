package inheritance;

import java.util.Scanner;

public class Handling {
	public static void main(String args[])
	{
		System.out.println("CONNECTION ESTLABLISHED");
		try
		{
			Scanner scan =new Scanner(System.in);
			int a=scan.nextInt();
			int b=scan.nextInt();
			int res=a/b;
			System.err.println(res);
			int arr[]=new int[3];
			int index=scan.nextInt();
			System.out.println(arr[index]);
			scan.close();
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(" ARTHEMATIC EXCEPTION HANDLED");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ARRAY HANDLED");
		}
		System.out.println("CONNECTION TERMINATED");
	}

}
