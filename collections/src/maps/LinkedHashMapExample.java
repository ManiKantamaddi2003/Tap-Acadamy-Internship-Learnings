package maps;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
//import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String args[]) {
        LinkedHashMap hm = new LinkedHashMap<>();
        
        hm.put(11, "Mani");
        hm.put(22, "Kanta");
        hm.put(35, "Doshna");
        hm.put(46, "Naga");
        hm.put(5, "Bhavani");
        hm.put(59, "Veera");
//        System.out.println(hm);
        Set s=hm.entrySet();
        Iterator itr=s.iterator();
        while(itr.hasNext())
        {
        	System.out.println(itr.next());
        }
        
        Set s1=hm.keySet();
        Iterator itr1=s1.iterator();
        while(itr1.hasNext())
        {
        	System.out.println(itr1.next());
        }
        
        Collection s11=hm.values();
        Iterator itr11=s11.iterator();
        while(itr11.hasNext())
        {
        	System.out.println(itr11.next());
        }
       System.out.println(hm.containsKey(11));
       System.out.println(hm.containsValue("Mani"));
       System.out.println(hm.isEmpty());
       System.out.println(hm.get(59));
       hm.remove(46);
       System.out.println(hm);
    }
}
