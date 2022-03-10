package com.launching;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLanching
{

	public static void main(String[] args) 
	{
		WebDriver driver;
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mr.Nani\\OneDrive\\Desktop\\software\\chromedriver.exe");
         
		WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		 driver = new ChromeDriver();
		driver.get("http://www.amazon.in");

		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("http://javatpoint.com");
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("http://www.bestbuy.com");
		
               
	}

}
