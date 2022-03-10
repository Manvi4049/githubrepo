package exceptionhandling;

import java.util.HashMap;
//import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class HashMapDemo 
{

	public static void main(String[] args)
	{
           HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
            h.put(21, 100);
            h.put(10, 123);
            h.put(90, 345);
            h.put(15, 456);
            System.out.println(h);
            System.out.println(h.get(15));
            System.out.println(h.size());
            System.out.println(h.hashCode());
            System.out.println(h.isEmpty());
            System.out.println(h.remove(10,123));
            System.out.println(h);
            Set<Integer> keys =h.keySet();
            for(Integer k:keys)
            {
            	System.out.println(k+"-->"+h.get(k));
            }
            System.out.println("------------");
           // LinkedHashMap<Integer,Integer> lh = new LinkedHashMap<Integer,Integer>();
            TreeMap<Integer,Integer> lh = new TreeMap<Integer,Integer>();
            lh.put(21, 100);
            lh.put(10, 123);
            lh.put(90, 345);
            lh.put(15, 456);
            System.out.println(lh);
            
            
	}

}
