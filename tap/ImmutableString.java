package tap;
public class ImmutableString {
	public static void main(String[] args)
	{
	String name="TAP";
	String rev="";
	int len=name.length();
	for(int i=len-1;i>=0;i--)
	{
		rev+=name.charAt(i);
		
		
	}
	System.out.println(name);
	System.out.println(rev);
	}

}
