package tap;

public class strings {
public static void main(String args[])
{
String s1="SAURAVCC";
String s2="SAU,RAV,CC";
System.out.println(s1.length());
System.out.println(s1.charAt(2));
System.out.println(s1.substring(3,7));
System.out.println(s1.indexOf(s1));
System.out.println(s1.lastIndexOf('C'));
System.out.println(s1.replace("SAU","MAU"));
System.out.println(s1.toLowerCase());
System.out.println(s1.toUpperCase());
String[] fruits = s2.split(",");

for (String i : fruits) {
    System.out.println(i);
}
}
}
