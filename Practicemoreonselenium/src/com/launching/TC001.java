package com.launching;

public class TC001 extends BaseClass
{

	public static void main(String[] args) throws Exception
	{
		    init();
         launcher("chromebrwoser");
         navigateurl("amazonurl");
         driver.manage().window().maximize();
         String title = driver.getTitle();
         System.out.println(title);
         
         String url = driver.getCurrentUrl();
         System.out.println(url);
         
         driver.manage().deleteAllCookies();
         
         driver.navigate().back();
         Thread.sleep(4000);
         
         driver.navigate().forward();
         Thread.sleep(4000);
         
         driver.navigate().refresh();
         Thread.sleep(4000);
         driver.close();
        // driver.quit();
         }

}
