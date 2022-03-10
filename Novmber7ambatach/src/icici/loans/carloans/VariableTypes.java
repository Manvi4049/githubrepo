package icici.loans.carloans;

public class VariableTypes 
{

	//primitive variable
	int x=100; //instance or global or non static
	static String name = "manvi";  // static or static global
	
	public void m1()  
	{
		int y = 200;//local
		System.out.println(y);//instance family: directly we can access
		System.out.println(VariableTypes.name );
		System.out.println(name );// static: static either directly/with class
		
	}
	public static void m2()
	{
		VariableTypes obj = new VariableTypes();
		System.out.println(obj.x);// instance:through class object
		System.out.println(VariableTypes.name );//static : directly/with className
	}
	public static void main(String[] args)
	{
      
		VariableTypes  obj = new VariableTypes();//non primitive/Reference variable
		System.out.println(obj.x);
		System.out.println(name);
		
	}

}
