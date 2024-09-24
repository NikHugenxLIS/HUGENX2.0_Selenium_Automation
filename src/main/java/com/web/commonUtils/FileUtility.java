package com.web.commonUtils;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class FileUtility 
{
	private WebDriver driver;
    static Properties properties;
   private final String propertyFilePath = "D://Selenium Project//Selenium_Automation//src//main//resources//testData//CommonData//CommonData.properties";

//         public FileUtility (WebDriver driver)
//
//
//        {
//	        this.driver = driver;
//         }
	
	public String getPropertyKeyValue(String Key) throws IOException
	{
		FileInputStream fis =new FileInputStream(propertyFilePath);
		Properties pobj= new Properties();
		pobj.load(fis);
		String value =pobj.getProperty(Key);
		return value;
	}

	public String getProperty(String keyvalue)
	{
		String key = properties.getProperty(keyvalue);
		return key;
	}
	
	public String getUserNameFromProperty()

	{
		String username = properties.getProperty("username");

		if (username != null)
			return username;
		else
			throw new RuntimeException("Text not specified in the Configuration.properties file.");

	}
	
	public String getPasswordFromProperty()

	{
		String password = properties.getProperty("password");

		if (password != null)
			return password;
		else
			throw new RuntimeException("Text not specified in the Configuration.properties file.");

	}
	
	public String getUrlFromProperty()

	{
		String url = properties.getProperty("url");

		if (url != null)
			return url;
		else
			throw new RuntimeException("url not specified in the Configuration.properties file.");

	}
	
	public String getBrowserfromproperty() throws IOException
	{
		String BROWSER = getPropertyKeyValue("BROWSER");

		if (BROWSER != null)
			return BROWSER;
		else
			throw new RuntimeException("url not specified in the Configuration.properties file.");
	}

	
	/**
     * Uploads a file using a Robot class to simulate keyboard actions.
     * 
     * @param filePath the full path to the file to be uploaded.
     * @throws Exception if there is an error during the upload process.
     */
    public void uploadFile (String filePath) throws Exception {
        // Create an instance of Robot class
        Robot robot = new Robot();
        robot.delay(5000);
        // Create a StringSelection object and set the clipboard with the file path
        StringSelection stringSelection = new StringSelection(filePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

        // Simulate pressing Ctrl+V to paste the copied file path
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.delay(5000); // Small delay to ensure the key press is registered
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        // Simulate pressing Enter to confirm the file selection
        robot.delay(5000); // Small delay before pressing Enter
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        // Additional delay to allow the file picker to close
        robot.delay(5000);
    }



}
