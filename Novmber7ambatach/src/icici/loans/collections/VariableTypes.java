package icici.loans.collections;

public class VariableTypes
{
	//primitive variable
     int x =100;//primitive instance variable
      static String name = "hello";//primitive static variable
      
     public void m1()
     {
    	 int a= 20;//primitive local variable
    	 System.out.println(x);
    	 System.out.println(VariableTypes.name);
    	 System.out.println(a);
     }
      
     public static void m2()
     {
    	 VariableTypes b = new VariableTypes();//local reference
    	 System.out.println(b.x);
    	 System.out.println(name);
    	 
     }
	public static void main(String[] args)
	{
		VariableTypes m = new VariableTypes();//non primitive(or) reference variable
		System.out.println(m.x);
		System.out.println(m.name);
		m.m1();
		m.m2();
	}

}
