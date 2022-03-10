package icici.loans.carloans;

import java.util.Scanner;

public class Mathoperations
{

	public static void main(String[] args)
	{
    int a, b, result;
    char choice;
    Scanner sc = new Scanner(System.in);
    do
    {
    	System.out.println("1.addition");
    	System.out.println("2.substration");
    	System.out.println("3.multiplicatin");
    	System.out.println("4.division");
    	System.out.println("5.exit");
    	choice =sc.next().charAt(0);
    	
    	switch(choice)
    	{
    	case '1':
    		System.out.println("enter values for addition:");
    		a = sc.nextInt();
    		b= sc.nextInt();
    		result =a+b;
    		System.out.println("addition result :"+result);
    		break;
    		
    	case '2':
    		System.out.println("enter values for substraction:");
    		a = sc.nextInt();
    		b= sc.nextInt();
    		result =a-b;
    		System.out.println("substration result :"+result);
    		break;
    	case '3':
    		System.out.println("enter values for multiplicatin:");
    		a = sc.nextInt();
    		b= sc.nextInt();
    		result =a*b;
    		System.out.println("multiplicatin result :"+result);
    		break;
    	case '4':
    		System.out.println("enter values for division:");
    		a = sc.nextInt();
    		b= sc.nextInt();
    		result =a/b;
    		System.out.println("division result :"+result);
    		break;
    		
    	case '5':
    		System.exit(0);
    		break;
    		default:
    			System.out.println("wrong choice please enter correct choice");
    			break;
    	}
    	
    	
    	
    } while(choice !=5);
    
    
	}

}
