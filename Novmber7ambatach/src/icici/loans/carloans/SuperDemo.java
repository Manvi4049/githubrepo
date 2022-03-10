package icici.loans.carloans;

public class SuperDemo extends ConstructorDemo
{
     String city;
    
	public SuperDemo(String city)
	{
		super();
		this.city = city ;
		
		System.out.println(this.city);
		 
		
	}

	public static void main(String[] args) 
	{
		 SuperDemo l = new SuperDemo("hydrabad");
		 
	}

}
