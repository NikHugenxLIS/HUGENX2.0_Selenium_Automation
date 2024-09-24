import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUpload 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		
		//WebDriver d = new ChromeDriver();
		WebDriver d = new FirefoxDriver();
		d.manage().window().maximize();
		d.get("https://demo.automationtesting.in/Register.html");
		//d.findElement(By.id("imagesrc")).click();
		WebElement button = d.findElement(By.xpath("//input[@id='imagesrc']"));
		JavascriptExecutor js =(JavascriptExecutor)d;
		js.executeScript("arguments[0].click();", button);
		Thread.sleep(5000);
		Runtime.getRuntime().exec("C://autoitfiles\fileupload.exe"+" "+"C:\\Users\\Lenovo\\Desktop\\fileupload\\Test");
		
		//"C://autoitfiles\\fileupload.exe"
	}
	
}
