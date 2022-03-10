package icici.loans.carloans;

class Methodoverriding1
{
    public void workhard() 
    {
       System.out.println("parent: wakeup early go to colloge");
    	
    }	
    	public void care()
    	{
    		System.out.println("parent: atmost care");
    	}
    
	
}
	
public class Methodoverriding extends Methodoverriding1
	{
		
	public void love()
	{
		System.out.println("i am in love");
	}
	
	public static void main(String[] args)
	{
		Methodoverriding m = new Methodoverriding();
		m.workhard();
		m.care();
		m.love();
	}

}
