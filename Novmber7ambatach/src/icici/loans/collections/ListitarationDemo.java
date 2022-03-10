package icici.loans.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListitarationDemo
{

	public static void main(String[] args)
	{
        ArrayList<String> str = new ArrayList<String>();
        str.add("hi");
        str.add("i");
        str.add("am");
        str.add("manvitha");
        System.out.println(str);
        ListIterator<String> g = str.listIterator();
        while(g.hasNext())
        {
		   String a =g.next();
		   if(a.equals("manvitha"))
			   str.set(0, "manvitha java");
		   else
			   g.remove();
		      
	    }
        System.out.println(str);
    }
}