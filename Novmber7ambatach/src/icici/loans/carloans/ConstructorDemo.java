package icici.loans.carloans;

public class ConstructorDemo
{
	
	int eno;
	String ename;
	float salary;
	
	public ConstructorDemo(int i, String string, double d)
	{
		super();
		System.out.println(" i am default constructor -----");
	}
	
	public ConstructorDemo(int i, String string)
	{
		//eno = i;
		//ename = string;
		//eno = eno;
		//ename = ename;
		//this.eno = eno;
		//this.ename = ename;
		//this.eno = i;
		//this.ename = string;
		eno = i;
		ename = string;
	}

	public ConstructorDemo(int i)
	{
		 this.eno = i;
	}
	

	public static void main(String[] args)
	{
		
	 
		ConstructorDemo c = new ConstructorDemo();
		//c.eno=2000;
		//c.ename ="manvi";
		System.out.println(c.eno);
		System.out.println(c.ename);
		System.out.println("-----------------------");
		
		ConstructorDemo d =new ConstructorDemo(1247,"manvi");
		 System.out.println(d.eno);
		 System.out.println(d.ename);
		 System.out.println("-----------------");
		 ConstructorDemo k = new ConstructorDemo(1900);
		 System.out.println(k.eno);
		 
		 System.out.println("----------------------------");
		 ConstructorDemo g = new ConstructorDemo(12345,"manvitha",33.5);
		    System.out.println(g.eno);
			System.out.println(g.ename);
			System.out.println(g.salary);
		
	}

	public ConstructorDemo(int eno, String ename, float salary) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.salary = salary;
		
	}
	

	public ConstructorDemo() {
		// TODO Auto-generated constructor stub
	}

}
