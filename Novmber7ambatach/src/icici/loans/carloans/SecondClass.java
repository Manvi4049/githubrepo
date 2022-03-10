package icici.loans.carloans;


public class SecondClass {
	int a=10,b=20,result;
	
	public void add()
	{
		result=a+b;
		System.out.println("add of a and b is:" + result);
	}
	public void sub()
	{
		result=a-b;
		System.out.println("sub of a and b:" + result);
	}
	
	public static void main(String[] args) {
		

		System.out.println("hello.......");
		 
		SecondClass obj =new SecondClass();
		obj.add();
		obj.sub();
		
	}

}
