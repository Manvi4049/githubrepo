package icici.loans.carloans;

public class StringDemo
{

	public static void main(String[] args)
	{
       String s= "manvitha";
       System.out.println(s);
       System.out.println(s.isEmpty());
       System.out.println(s.length());
       System.out.println(s.hashCode());
       System.out.println(s.charAt(2));
       System.out.println(s.indexOf('a'));
       
       String s1 = new String("hello java");
       System.out.println(s.equals(s1));
        String s2= "hello java";
        System.out.println(s1.contentEquals(s2));
        System.out.println((s1.equalsIgnoreCase(s2)));
       String s3 =s2+s1;
       System.out.println(s3);
       System.out.println(s1.concat(s));
        
       
	}

}
