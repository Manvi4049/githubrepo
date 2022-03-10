package exceptionhandling;

import java.util.Scanner;

public class ExceptionDemo
{
	public static void main(String[] args) 

	{
           int nr ,dr,result;
           Scanner sc = new Scanner(System.in);
           
           
           // a  = new ArithmeticException("divided by zero");
           while  (true)
           {
        	   
        	   System.out.println("enter nr value");
        	   
        	   nr = sc.nextInt();
        	   
        	   System.out.println("enter dr value");
        	   dr= sc.nextInt();
        	   
        	 try
        	 {
				result =nr/dr;
				 System.out.println(result);
				 break;
				 
			} 
        	 catch (ArithmeticException e) 
        	 {
				e.printStackTrace();
			}
        	 
           
	}
     

}
}
