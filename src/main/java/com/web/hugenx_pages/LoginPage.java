package com.web.hugenx_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import com.web.commonUtils.WebDriverUtility;

import java.time.Duration;


public class LoginPage 
{

	public WebDriver driver;
	public WebDriverUtility utility;


	private By usernametb = By.xpath("//input[@formcontrolname='Username']");
	private By passwordtb = By.xpath("//input[@formcontrolname='Password']");
	private By loginBtn = By.xpath("//button[@type='submit']");


	public LoginPage(WebDriver driver) {


		this.driver = driver;
		this.utility = new WebDriverUtility(driver);
	}
	

	
	public void enterUsername(String username, Duration timeoutInSeconds) throws InterruptedException
	{

		utility.sendKeys(usernametb, username, timeoutInSeconds);
	}

	public void enterPassword(String password) 
	{
		driver.findElement(passwordtb).sendKeys(password);
	}

	public void clickLoginButton()
	{
		//driver.findElement(loginBtn).click();
		utility.clickElement(loginBtn, Duration.ofSeconds(2000));
	}

	public String getLoginBtnText()
	{
		String text = driver.findElement(loginBtn).getText();
		return text;
	}





}
