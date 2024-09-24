import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.web.commonUtils.WebDriverUtility;

public class FileUploadUsingSendKeys 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//WebDriver d = new ChromeDriver();
		WebDriver d = new FirefoxDriver();
		d.manage().window().maximize();
		d.get("https://smallpdf.com/pdf-to-word");
		/**WebElement button = d.findElement(By.xpath("//input[@type='file']"));
		//JavascriptExecutor js =(JavascriptExecutor)d;
		//js.executeScript("arguments[0].click();", button);
		Thread.sleep(5000);
		button.sendKeys("C:\\Users\\Lenovo\\Desktop\\fileupload\\txt.pdf.pdf");
		*/
		String filePath = "C:\\Users\\Lenovo\\Desktop\\fileupload\\txt.pdf.pdf";
        By fileInputLocator = By.xpath("//input[@type='file']");
		
		WebDriverUtility wutils = new WebDriverUtility(d);
		wutils.uploadFile(filePath, fileInputLocator);
	}

}
