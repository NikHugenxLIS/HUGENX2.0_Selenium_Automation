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

		commonHelper.loginToApplication(Duration.ofSeconds(30));
		
	}

}