package icici.loans.collections;

import java.util.ArrayList;

public class ListDemo 
{

	public static void main(String[] args)
	{
         // ArrayList a = new ArrayList();
          ArrayList <Object>  a = new ArrayList<Object>();
            a.add(10);
            a.add("manvitha");
            a.add(67);
            a.add(12.3f);
            a.add(56.89);
            System.out.println(a);
            System.out.println(a.get(1));
            System.out.println(a.isEmpty());
            System.out.println(a.hashCode());
            System.out.println(a.contains("manvitha"));
            System.out.println(a.contains("manvithA"));
            System.out.println(a);
            a.add(40);
            System.out.println(a);
            
            a.add(1,"sai");
            System.out.println(a);
            
            a.set(1, "java");
            System.out.println(a);
            
            System.out.println(a.size());
            System.out.println(a.subList(2, 7));
            a.remove(1);
            System.out.println(a);
             a.clear();
             System.out.println(a);
            
	}

}
