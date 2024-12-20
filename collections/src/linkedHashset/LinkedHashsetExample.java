package linkedHashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashsetExample {
 public static void main(String args[])
 {
	 LinkedHashSet lhs=new LinkedHashSet();
	 lhs.add(10);
	 lhs.add(20);
	 lhs.add(30);
	 lhs.add(30);
	 lhs.add(40);
	 lhs.add(50);
	 
	 for(Object o:lhs)
	 {
		 System.out.println(o);
	 }
	 System.out.println();
	 
	 Iterator itr=lhs.iterator();
	 while(itr.hasNext())
	 {
		 System.out.println(itr.next());
	 }
	 
 }
}
