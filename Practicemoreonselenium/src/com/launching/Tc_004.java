package com.launching;

public class Tc_004 extends BaseClass
{

	public static void main(String[] args) throws Exception 
	{
		//WebDriverManager.edgedriver().setup();
	    // WebDriver driver = new EdgeDriver();
	    // driver.navigate().to("http://icicibank.com");
		
		init();
		launcher("firefoxbrowser");
		navigateurl("iciciurl");

	}

}
