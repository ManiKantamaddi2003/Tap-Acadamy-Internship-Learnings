package treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String args[])
	{
		TreeSet ts=new TreeSet();
		ts.add(1);
		ts.add(20);
		ts.add(13);
		ts.add(45);
		ts.add(50);
//		System.out.println(ts.ceiling(25));
//		System.out.println(ts.higher(20));
//		System.out.println(ts.floor(20));
//		System.out.println(ts.lower(20));
		System.out.println(ts.headSet(20)); //exclude 20
//		System.out.println(ts.tailSet(20));	//include 20
//		System.out.println(ts.subSet(13,50)); //include 13
//		for(Object o:ts)
//		{
//			System.out.println(o);
//		}
//		 Iterator itr =ts.iterator();
//		 while(itr.hasNext())
//		 {
//			 System.out.println(itr.next());
//		 }
		 Iterator itr2=ts.descendingIterator();
		 while(itr2.hasNext())
		 {
			 System.out.println(itr2.next());
		 }
	}
}
