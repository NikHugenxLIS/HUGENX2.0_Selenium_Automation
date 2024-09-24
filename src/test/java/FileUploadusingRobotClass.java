import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.web.commonUtils.FileUtility;
import com.web.commonUtils.WebDriverUtility;


public class FileUploadusingRobotClass 
{
	public static void main(String[] args) throws Exception 
	{
		WebDriver d = new FirefoxDriver();
		d.manage().window().maximize();
		d.get("https://smallpdf.com/pdf-to-word");
		//WebElement button = d.findElement(By.xpath("//input[@type='file']"));
		By elementLocator = By.xpath("//input[@type='file']");
		WebDriverUtility wutils = new WebDriverUtility(d);
		wutils.clickElementUsingJavaScript( elementLocator);
		/**JavascriptExecutor js =(JavascriptExecutor)d;
		js.executeScript("arguments[0].click();", button);
		
		Robot rb = new Robot();
		rb.delay(5000);
		
		
		StringSelection ss = new StringSelection("C:\\Users\\Lenovo\\Desktop\\fileupload\\txt.pdf.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.delay(5000);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.delay(5000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		*/
		
		FileUtility futil = new FileUtility();
		futil.uploadFile("C:\\Users\\Lenovo\\Desktop\\fileupload\\txt.pdf.pdf");
	}

}
