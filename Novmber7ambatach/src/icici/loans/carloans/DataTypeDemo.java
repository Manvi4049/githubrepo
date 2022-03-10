package icici.loans.carloans;

public class DataTypeDemo 
{
	//integer types
	byte b=127;//byte
	short s= -32768;//2bytes
	int i = 2147483647;//4bytes
	long l= 2147483647;//8bytes
	
     //floating type
	  float f = 12.34f;// 4 bytes
	  double d= 23.34;//8bytes
	  
	  boolean bb=true;
	  char ch='a';//2bytes
	  String name = "manvi";
	

	public static void main(String[] args)
	{
		DataTypeDemo obj = new DataTypeDemo();
		System.out.println("byte:"+ obj.b);
		System.out.println("short:"+obj.s);
		System.out.println("integer:"+obj.i);
		System.out.println("long:"+obj.l);
		System.out.println("float:"+obj.f);
		System.out.println("double:"+obj.d);
		System.out.println("boolean:"+obj.bb);
		System.out.println("char:"+obj.ch);
		System.out.println("string:"+obj.name);
	}		
		
		  
		
	
}
