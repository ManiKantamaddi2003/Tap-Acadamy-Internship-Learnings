package arraydeque;

import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayDequeExample {
	public static void main(String args[])
	{
		ArrayList al=new ArrayList();
//		al.add(1);
//		al.add(2);
//		al.add(3);
//		al.add(4);
//		al.add(5);
		
		ArrayDeque ad=new ArrayDeque();
//		ad.add(10);
//		ad.add(20);
//		ad.add(30);
//		ad.add(40);
//		//ad.add(null);
//		ad.add("hi");
//		ad.addFirst("A");
//		ad.add("Z");
//		ad.remove();
//		ad.removeFirst();
//		ad.removeLast();
//		System.out.println(ad);
		//ad.add(al);
		//ad.add(1,100);
		
//		System.out.println(ad.isEmpty());
//		Iterator itr=ad.descendingIterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
//		
		ad.push(10);
		ad.push(20);
		ad.push(30);
		ad.push(40);
		
		System.out.println(ad);
		System.out.println(ad.peek());
		System.out.println(ad.poll());
		System.out.println(ad.pop());
		System.out.println(ad.pop());
		System.out.println(ad.pop());
//		System.out.println(ad.pop());
		System.out.println(ad);
		
		
	}

}
