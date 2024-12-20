package hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
	public static void main(String args[])
	{
		HashSet ts=new HashSet();
		//it does not allows duplicates
		//it allows null values
		//it store data
		//it does not preserve the order of insertion
		
		ts.add(10);
		ts.add(20);
		ts.add(30);
		ts.add(30);
		ts.add(40);
		ts.add(50);
		
//		System.out.println
		// supports enhanced for loop
		for(Object o:ts)
		{
			System.out.println(o);
		}
		System.out.println();
		
		
		
		Iterator itr=ts.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println();
		
		// doesnot support descending iterator
		
		System.out.println(ts.isEmpty());
		System.out.println();
	}

}
