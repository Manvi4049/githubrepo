package icici.loans.carloans;

import java.util.Scanner;

public class DebuggingDemo
{
      public int m1()
      {
    	  Scanner sc = new Scanner(System.in);
  		System.out.println("enter the array size");
  		int asize = sc.nextInt();
  		int [] a = new int[asize];
  		int sum =0;
  		
  		System.out.println("entre the array elements");
  	    
  	     for( int i=0; i<a.length;i++)
  	     {
  	    	 a[i] =sc.nextInt();
  	    	 System.out.println("a["+i+"]="+a[i]);
  	    	 sum=sum+a[i];
  	     }
  	     System.out.println("sum of array is :"+sum); 
  	     return sum;
      }
	public static void main(String[] args)
	{
		 DebuggingDemo d= new DebuggingDemo();
		// d.m1();
		 int count = d.m1();
		 System.out.println("count of array is:"+count);
    }
}


