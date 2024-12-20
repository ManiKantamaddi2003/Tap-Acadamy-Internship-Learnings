package maps;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String args[])
	{
		TreeMap tm=new TreeMap();
		tm.put(1,"Doshna");
		tm.put(2, "Naga");
		tm.put(3, "Veera");
		tm.put(4, "Bhavani");
		tm.put(5, "Manikanta");
		//System.out.println(tm);
		
//		Set s=tm.entrySet();
//		Iterator itr=s.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		
//		Set s=tm.keySet();
//		Iterator itr=s.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		
//		Collection s=tm.values();
//		Iterator itr=s.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		
		System.out.println(tm.get(4));
		System.out.println(tm.size());
		System.out.println(tm.get(4));
		System.out.println(tm.containsKey(4));
		System.out.println(tm.containsValue(4));
		System.out.println(tm);
		tm.remove(4);
		System.out.println(tm);
		
		
	}

}
