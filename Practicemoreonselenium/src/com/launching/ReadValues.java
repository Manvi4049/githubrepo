package com.launching;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadValues 
{

	public static void main(String[] args) throws IOException 
	{
          
		FileInputStream f =new FileInputStream("C:\\Users\\Mr.Nani\\OneDrive\\Desktop\\Land of java\\Practicemoreonselenium\\src\\com\\launching\\data.properties");
		Properties p = new Properties();
		p.load(f);
		System.out.println(p.getProperty("chromebrowser"));
		System.out.println(p.getProperty("bestbuyurl"));
		
		
	}

	
}
