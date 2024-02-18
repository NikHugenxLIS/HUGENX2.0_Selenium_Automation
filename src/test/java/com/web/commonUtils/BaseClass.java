package com.web.commonUtils;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
public class BaseClass 
{
	public WebDriver driver ;
    public  String BROWSER;
   
	FileUtility fLib = new FileUtility();
	JavaUtility jLib = new JavaUtility();
	ExcelUtility eLib = new ExcelUtility();
	
	
	@BeforeClass
	public void configBC() throws IOException
	{
		
		System.out.println("============Lauch the browser==========");
		String browser = fLib.getPropertyKeyValue("BROWSER");
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver =new FirefoxDriver();
			driver.manage().window().maximize();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		}
		else
		{
			System.out.println("Browser not found");
		}
	}
	
	
	
	@BeforeMethod
	public void configBM() throws IOException
	{
		
		//String BROWSER = fLib.getPropertyKeyValue("browser");
		//String BROWSER = "edge";
		//this.BROWSER=BROWSER;
		String URL = fLib.getPropertyKeyValue("url");
		String USERNAME = fLib.getPropertyKeyValue("username");
		String PASSWORD = fLib.getPropertyKeyValue("password");
	
		driver.get(URL);
		
		//LOGIN lp = new LOGIN(driver);
		//lp.loginToApp(USERNAME, password);
		

	}
	@AfterMethod
	public void configAM() throws InterruptedException
	{     
		
		//HomePage HomePage = new HomePage(driver);
		//Thread.sleep(60000);
		//HomePage.logoutAction();
	}
	
	@AfterClass
	public void configAC()
	{
		//driver.close();
	}
}

