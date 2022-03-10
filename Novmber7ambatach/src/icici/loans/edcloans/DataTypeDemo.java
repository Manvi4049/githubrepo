package icici.loans.edcloans;


public class DataTypeDemo 
{

	//integer types
		byte b;//byte
		short s;//2bytes
		int i ;//4bytes
		long l;//8bytes
		
	     //floating type
		  float f ;// 4 bytes
		  double d;//8bytes
		  
		  boolean bb;
		  char ch;//2bytes
		  String name ;
		  static String cname;
		  static float roi;

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
			System.out.println("cname"+ DataTypeDemo.cname);
			System.out.println("roi"+DataTypeDemo.roi);
				
				  
			
		}	  
	

}
