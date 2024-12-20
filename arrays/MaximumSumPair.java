package arrays;
import java.util.Scanner;
public class MaximumSumPair {	
	static int MaxSumPair(int arr[]) {
		int p=Integer.MIN_VALUE;
		int vp=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>p)
			{
				
				vp=p;
				p=arr[i];
			}
			else if(arr[i]>vp && arr[i]!=p)
			{
				vp=arr[i];
			}
		}
		return vp+p;
	}
	static int MaxProductPair(int arr[]) {
		int p=Integer.MIN_VALUE;
		int vp=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>p)
			{
				
				vp=p;
				p=arr[i];
			}
			else if(arr[i]>vp && arr[i]!=p)
			{
				vp=arr[i];
			}
		}
		return vp*p;
	}
	static void MinSumPair(int arr[]) {
		int p=Integer.MAX_VALUE;
		int vp=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<p)
			{
				
				vp=p;
				p=arr[i];
			}
			else if(arr[i]<vp )
			{
				vp=arr[i];
			}
		}
		System.out.println(arr[p]+" "+arr[vp]);;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n = scan.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		
//		int result = MaxSumPair(arr);
//		System.out.println("The Maimum Sum of Pair is: " + result);
//		
//		int result1 = MaxProductPair(arr);
//		System.out.println("The Maimum Sum of Pair is: " + result1);
		MinSumPair(arr);
		//System.out.println("The Maimum Sum of Pair is: " + result);

		
		scan.close();
	}
}
