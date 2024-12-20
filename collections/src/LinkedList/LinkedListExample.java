package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {
	public static void main(String args[])
	{
		LinkedList ll=new LinkedList();
//		ll.add(1);
//		ll.add(2);
//		ll.add(3);
//		ll.add(4);
//		ll.add(5);
//		System.out.println(ll);
//		ll.add(0,100);
//		System.out.println(ll);
//		ll.addFirst(0);
//		System.out.println(ll);
//		ll.addLast(6);
//		System.out.println(ll);
//		ll.remove(1);
//		System.out.println(ll);
//		ll.remove();
//		System.out.println(ll);
//		ll.removeFirst();
//		System.out.println(ll);
//		ll.removeLast();
//		System.out.println(ll);
//		System.out.println(ll.get(0));
////		System.out.println(ll);
//		System.out.println(ll.getFirst());
//		System.out.println(ll.getLast());
//		ll.set(0, 10);
//		System.out.println(ll);
//		System.out.println(ll.contains(100));
//		System.out.println(ll.size());
//		ll.clear();
//		System.out.println(ll);
//		System.out.println(ll.isEmpty());
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		ll.add(6);
//		
//		System.out.println(ll.indexOf(1));
//		System.out.println(ll.lastIndexOf(1));
//		System.out.println(ll.peek());
//		System.out.println(ll);
//		System.out.println(ll.poll());
//		System.out.println(ll);
//		ll.offer(200);
//		System.out.println(ll);
//		ll.offerFirst("hii");
//		ll.offerLast("bye");
//		System.out.println(ll);
//		ll.toArray();
//		System.out.println(ll);
//		Iterator iterator =ll.descendingIterator();
//		
//		   System.out.print("Elements in reverse order: ");
//	        while (iterator.hasNext()) {
//	            System.out.print(iterator.next() + " ");
//	        }
//	        System.out.println();
//		
//	        Object[] array = ll.toArray();
//	        System.out.print("Array: ");
//	        for (Object obj : array) {
//	            System.out.print(obj + " ");
//	        }
//	        System.out.println();
//	        // 22. clone() - Returns a shallow copy of the LinkedList
//	        LinkedList clonedList = (LinkedList) ll.clone();
//	        System.out.println("Cloned list: " + clonedList);
		
//		for(int i=0;i<ll.size();i++)
//		{
//			System.out.println(ll.get(i));
//		}
//	
//		for(Object ele:ll)
//		{
//			System.out.println(ele);
//		}
//	
//		Iterator itr=ll.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
//		ListIterator itr=ll.listIterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		
		ListIterator itr=ll.listIterator(ll.size());
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
	}

}
