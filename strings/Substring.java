package strings;

import java.util.Scanner;

public class Substring {
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		String input=scanner.nextLine();
		String input2=scanner.nextLine();
		if(subsequence(input,input2))
		{
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
	}
	
	public static boolean subsequence(String str1,String str2) {
		int j=0;
		for(int i=0;i<str1.length();i++)
		{
			if(str1.charAt(i)== str2.charAt(j)){
				j++;
			}
			if(j==str2.length())
			{
				return true;
			}
		}
		return false;
	}

}
