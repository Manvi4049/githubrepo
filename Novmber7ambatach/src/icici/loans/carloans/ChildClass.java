package icici.loans.carloans;

public class ChildClass extends FristAbstract
{

	public static void main(String[] args) 
	{
		
		ChildClass obj = new ChildClass();
		obj.m1();
		obj.m2();
	}

	@Override
	public void m1()
	{
         System.out.println(" i am m1 override from childclass");		
	}

}
