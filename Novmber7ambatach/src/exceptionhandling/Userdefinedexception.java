package exceptionhandling;

import java.util.Scanner;

public class Userdefinedexception extends Exception
{

	public Userdefinedexception(String string)
	{
		super(string);
	}

	public static void main(String[] args)
	{
        String str;
        Scanner sc = new Scanner(System.in);
        
        while(true)
        {
        	
        	System.out.println("enter the string have 10 digits string");
            str = sc.nextLine();
        try
        {
        	if(str.length()!=10)
        	{
        		throw new Userdefinedexception("should be a 10 character string");
 
        	}
        	else
        	{
        		System.out.println(str);
        		break;
        	}
        }
        catch(Userdefinedexception  e)
        {
        	e.printStackTrace();
        }
	}

}
}
