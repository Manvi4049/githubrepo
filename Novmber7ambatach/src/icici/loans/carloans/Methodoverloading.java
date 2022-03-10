package icici.loans.carloans;

public class Methodoverloading
{
     public void m1(int x)
     {
    	 System.out.println(x);
    	
     }
     public void m1(float x)
     {
    	 System.out.println(x);
     }
     public void m1(String x)
     {
    	 System.out.println(x);
     }
	public static void main(String[] args)
	{
		Methodoverloading obj = new Methodoverloading();
		obj.m1(100);
		obj.m1(23.70f);
		obj.m1("manvi");
		obj.m1(80);
		obj.m1(46.9f);
		obj.m1("praisy");
		
	}

}
