package icici.loans.carloans;

public class InheritanceDemo extends D
{
         
	public void m2()
	{
		System.out.println(" i am m2 in inheritance demo");
	}
	
	
	public static void main(String[] args)
	{
 
		     // D d= new D(); // has A relation
		     // d.m1();
		      InheritanceDemo  i =  new InheritanceDemo();// is A relation means we can use extends 
		      i.m2();
		      i.m1();
		      System.out.println("-----------------------------");
		      // we can use parent class reference variable  to refer/hold child class object
		      D d = new D();
		      d.m1();
		      System.out.println("----------------");
		 //   InheritanceDemo obj1 =  (InheritanceDemo) d;
		    //   obj1.m1();
		    //  obj1.m2();
		      //we cannot use child class reference variable to hold parent class object
		    //  InheritanceDemo  a1 = (InheritanceDemo) new D();
		     // a1.m1();
		     // a1.m2();
		      
		    		  
	}

}
