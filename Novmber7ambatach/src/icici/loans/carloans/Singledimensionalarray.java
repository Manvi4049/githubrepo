package icici.loans.carloans;

import java.util.Scanner;

public class Singledimensionalarray
{

	public static void main(String[] args)
	{
       
		/*int[] a = {10,20,30,40};
		for(int i=0;i<a.length;i++)
		{
			System.out.println("a["+i+"]="+a[i]);
		} */
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array size");
		int asize = sc.nextInt();
		int [] a = new int[asize];
		int sum =0;
		
		
		/*int [] b= new int[7];
		
	     b[0]=10;
	     b[1] =20;
	     b[2] =30;
	     b[3]=40;
	    b[4]= 50;
	    b[5]=60;
	    b[6]=70;*/
		System.out.println("entre the array elements");
	    
	     for( int i=0; i<a.length;i++)
	     {
	    	 a[i] =sc.nextInt();
	    	 System.out.println("a["+i+"]="+a[i]);
	    	 sum=sum+a[i];
	     }
	     System.out.println("sum of array is :"+sum);
}
	
}
