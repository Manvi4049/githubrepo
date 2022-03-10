package exceptionhandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Checkedexceptions
{
	public static void m1() 
	{
		 try {
			BufferedReader b = new BufferedReader(new FileReader("d:abbc.xyz"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws FileNotFoundException
	{
         m1();
	}

}
