package icici.loans.carloans;

public class TypeCastingDemo
{
	  // one liter bottle  -->  500ml  --> no risk -->widening
	  // one liter bottle  -->  1.5liters --> there is risk(overflow)-->narrowing

	public static void main(String[] args)
	{
		int x=10;
		System.out.println(x);
		double y=x;
		System.out.println(y);
		
		double a=45.9;
		int d=(int) a;
		System.out.println(d);
		
		
		System.out.println("--------------------------------------");
		int b=67;
		System.out.println(b);
		char c=(char) b;
		System.out.println(c);
		

	}

}
