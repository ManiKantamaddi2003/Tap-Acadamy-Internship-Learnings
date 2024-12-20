package strings;

import java.util.Scanner;

public class ReverseString {

	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		printSpaces(str);

		
	}
	public static String reverseString(String str)
	{
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev+=str.charAt(i);
		}
		return rev;
	}
	
	public static void rev(String s)
	{
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
	}
	public static String checkPalindrom(String str)
	{
		int i=1;
		int j=str.length()-1;
		while(i<j)
		{
			if(str.charAt(i)==str.charAt(j))
			{
				i++;
				j--;
			}
			else {
				return "Not Palindrom";
			}
		}
		return "palindrom";
	}
	public static void printSpaces(String str)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(str.charAt(i)==' ') {
				count++;
			}
		}
		System.out.println(count);
	}
}
