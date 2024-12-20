package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class ArrayListCollectionFramework {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //System.out.println("Enter the number of elements:");
        //int n = scan.nextInt();
        
        ArrayList al = new ArrayList<>(); 
        ArrayList al2= new  ArrayList<>();
        ArrayList al3=new ArrayList<>();        
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        
        al2.add(10);
        al2.add(20);
        al2.add(30);
        al2.add(40);
        al2.add(50);
        al2.add(0,0);
        
        al3.add(100);
        al3.add(200);
        al3.add(300);
        al3.add(400);
        al3.add(500);
        al3.add(0,0);
        
//        al.addAll(al2);
//        System.out.println(al);
//        al.add(2, al3);
//        System.out.println(al);
//        al.removeAll(al2);
//        System.out.println(al);
//        al2.removeAll(al);
//        System.out.println(al2);
//        al.retainAll(al2);
//        System.out.println(al);
//        al2.retainAll(al);
//        System.out.println(al2);
//        al.remove(0);
//        System.out.println(al);
//        System.out.println(al.size());
//        al.set(1, 2000);
//        System.out.println(al);
//        System.out.println(al.get(1));
//        System.out.println(al.contains(5000));
//        System.out.println(al.isEmpty());
//        for(int i=0;i<al.size();i++)
//        {
//        	System.out.println(al.get(i));
//        }
//        System.out.println();
//        for(Object ele: al)
//        {
//        	System.out.println(ele);
//        }
//        System.out.println();
//        Iterator itr=al.iterator();
//        while(itr.hasNext())
//        {
//        	System.out.println(itr.next());
//        }
//        System.out.println();
//        
//        ListIterator litr=al.listIterator();
//        while(litr.hasNext())
//        {
//        	System.out.println(litr.next());
//        }
//        System.out.println();
//        
        ListIterator litr1=al.listIterator(5);
//        
        while(litr1.hasPrevious())
        {
        	System.out.println(litr1.previous());
        }
        
    }
}
