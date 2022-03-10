package com.launching;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

public class BaseClass
{
     public static WebDriver driver;
     public static FileInputStream fis;
     public static Properties mainprop;
      public static Properties childprop;
    
      static String projectpath = System.getProperty("user.dir");
     public static Properties p;
     
     
     public static void init() throws IOException 
     {  
    	 
    	 fis = new FileInputStream("C:\\Users\\Mr.Nani\\OneDrive\\Desktop\\Land of java\\Practicemoreonselenium\\src\\com\\launching\\data.properties");
    	  p = new Properties();
    	 p.load(fis);
    	 String value = p.getProperty("amazonurl");
    	 System.out.println(value);
    	 
    	 fis =new FileInputStream("C:\\Users\\Mr.Nani\\OneDrive\\Desktop\\Land of java\\Practicemoreonselenium\\src\\com\\launching\\environment.properties");
    	 mainprop = new Properties();
    	mainprop.load(fis);
    	String e= mainprop.getProperty("env");
    	 System.out.println(e);
    	 
    	fis = new FileInputStream("C:\\Users\\Mr.Nani\\OneDrive\\Desktop\\Land of java\\Practicemoreonselenium\\src\\com\\launching\\environment.properties");
    	 childprop = new Properties();
    	 childprop.load(fis);
    	String url = childprop.getProperty("amazonurl");
    	System.out.println(url);
    	 
     }
     public static void launcher(String browser)
     {
    	 if(p.getProperty("chromebrowser").equals("chrome"))
    	    {
    		 ChromeOptions option =new ChromeOptions();
    		 
    		 option.addArguments("user-data-dir=C:\\Users\\Mr.Nani\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 13");
    		 
    		 option.addArguments("--disable-notifications");
 			option.addArguments("--start-maximized");
 			//certificate errors handling
 			option.addArguments("--ignore-certificate-errors-spki-list");
 			//Proxy ip settings
 			//option.addArguments("--proxy-server=https://192.168.10.1:9090");

    		 
    		 driver = new ChromeDriver(option);
    		 
    	 }
     else if(p.getProperty("firefoxbrowser").equals("firefox"))
    	 {
    		 
    		// driver = new FirefoxDriver();

             ProfilesIni p = new ProfilesIni();
	FirefoxProfile profile = p.getProfile("sample");
	
	FirefoxOptions option = new FirefoxOptions();
	option.setProfile(profile);
	
	//Notifiations
	profile.setPreference("dom.webnotifications.enabled", false);
	
	//Certificate Errors
	profile.setAcceptUntrustedCertificates(true);
	profile.setAssumeUntrustedCertificateIssuer(false);
	
	//How to work with Proxy Settings
	profile.setPreference("network.proxy.type", 1);
	profile.setPreference("netwirk.proxy.socks", "192.168,10.1");
	profile.setPreference("network.proxy.socks_port", 1744);
	
	driver = new FirefoxDriver(option);
}
    	 }
    	 
     
     
	public static void navigateurl(String url) 
	{
           driver.get(p.getProperty(url));
	}

}
