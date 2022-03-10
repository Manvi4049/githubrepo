package icici.loans.edcloans;

import icici.loans.carloans.D;
import icici.loans.carloans.InheritanceDemo;

public class E extends InheritanceDemo 
{
	
	   public void m4()
	   {
		   System.out.println(" i am m4 in different package");
	   }

	public static void main(String[] args) 
	{
		InheritanceDemo k = new InheritanceDemo();
		      k.m2();
		      k.m1();
		      
	      System.out.println("------------------------");
		
		
		        E e= new E();
		          e.m4();
		          e.m2();
		          e.m1();
		  System.out.println("---------------------");
		          D d = new D();
		          d.m1();
	}

}
