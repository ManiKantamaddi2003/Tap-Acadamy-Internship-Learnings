package arrays;
import java.util.Scanner;
public class SecondGreatestElement {	
	static int secondLargest(int arr[]) {
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
		return vp;
	}
	
	static int largestSumPair(int arr[]) {
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
	
	
		static int secondSmallest(int arr[]) {
			int p=Integer.MAX_VALUE;
			int vp=Integer.MAX_VALUE;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]<p)
				{
					
					vp=p;
					p=arr[i];
				}
				else if(arr[i]<vp && arr[i]!=p)
				{
					vp=arr[i];
				}
			}
			return vp;
		}
		
		static int smallestSumPair(int arr[]) {
			int p=Integer.MAX_VALUE;
			int vp=Integer.MAX_VALUE;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]<p)
				{
					
					vp=p;
					p=arr[i];
				}
				else if(arr[i]<vp && arr[i]!=p)
				{
					vp=arr[i];
				}
			}
			return vp*p;
		}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n = scan.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		
//		int result = secondLargest(arr);
//		System.out.println("The second largest element is: " + result);
//		int result1 = secondSmallest(arr);
//		System.out.println("The second largest element is: " + result1);
		
		int largestpair=largestSumPair(arr);
		
		int smallestPair=smallestSumPair(arr);
		
		int res=(largestpair>smallestPair)?largestpair:smallestPair;
		
		System.out.println(res);
		//System.out.println(smallestPair);
		scan.close();
	}
}
