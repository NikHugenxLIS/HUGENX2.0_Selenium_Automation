package com.hugenx.Login;

import com.web.commonUtils.FileUtility;
import com.web.hugenx.pages.LoginPage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginScript  {

	LoginPage loginpage;
	FileUtility fileutility;
	public LoginScript(WebDriver driver) {
		loginpage = new LoginPage(driver);
		fileutility = new FileUtility();
	}


	public void clickOnLoginBtn() throws IOException, InterruptedException
	{
		String username = fileutility.getPropertyKeyValue("username");
		String password = fileutility.getPropertyKeyValue("password");
		Assert.assertEquals(loginpage.getLoginBtnText(), "LOGIN","Login Page is not Loaded as LOGIN Btn is not displayed");
		loginpage.enterUsername(username);
		loginpage.enterPassword(password);
     	loginpage.clickLoginButton();
		
	}

}