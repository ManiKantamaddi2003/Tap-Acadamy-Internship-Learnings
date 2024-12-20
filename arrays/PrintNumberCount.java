package arrays;
import java.util.Scanner;

public class PrintNumberCount {
	public static void main(String args[])
	{
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		int arr[]=new int[n];
		int count=1;
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
		count(arr,n);
	}
	public static void count(int arr[],int n)
	{
		int count=1;
		for(int i=1;i<n;i++)
		{
			if(arr[i]==arr[i-1])
			{
				count++;
			}
			else
			{
				System.out.println(arr[i-1]+":"+count);
				count=1;
			}
		}
		System.out.println(arr[n-1]+":"+count);
		
	}

}
