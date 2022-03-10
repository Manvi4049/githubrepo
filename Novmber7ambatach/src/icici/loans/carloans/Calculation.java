package icici.loans.carloans;

public class Calculation 
{
      
	int a,b,result;
	
	
	
	public Calculation(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public void add()
	{
		result = a+b;
		System.out.println("add of A ana B is :" + result);
		
	}
	
	public void sub()
	{
		result = a-b;
		System.out.println("sub of A ana B is :" + result);
		
	}
	public static void main(String[] args)
	{
		Calculation c = new Calculation(100, 200);
		  c.add();
		  c.sub();
		  Calculation d = new Calculation(400,800);
		      d.add();
		      d.sub();
	}

}
