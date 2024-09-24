package com.hugenx.Login;

import com.web.commonUtils.CommonHelper;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class LoginScript  {

	CommonHelper commonHelper;
	public LoginScript(WebDriver driver) {
		commonHelper = new CommonHelper(driver);
	}


	public void clickOnLoginBtn() throws IOException, InterruptedException
	{
		//String username = fileutility.getPropertyKeyValue("username");
		//String password = fileutility.getPropertyKeyValue("password");

<<<<<<< HEAD
		loginpage.enterUsername(data.get(1));
		loginpage.enterPassword(data.get(2));
     	loginpage.clickLoginButton();
		//Assert.assertEquals(loginpage.getLoginBtnText(), "LOGIN","Login Page is not Loaded as LOGIN Btn is not displayed");
=======
		commonHelper.loginToApplication(Duration.ofSeconds(30));
		
>>>>>>> 2bfb6d00a348c06371b535d00cbafdef3e623ebc
	}

}