package com.hugenx.runner;

import com.hugenx.Login.LoginScript;
import com.web.commonUtils.BaseClass;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.Test;

public class LoginTest extends BaseClass
{
	    @Test //(retryAnalyzer =  Retry.class)
      public void loginInToTheApplication() throws IOException, InterruptedException
      {
          Duration timeeout =Duration.ofSeconds(30);
    	   LoginScript ls = new LoginScript(driver);
    	   ls.clickOnLoginBtn();
          //Assert.assertEquals("Login Successful","You have Successfully signed into your account");
      }
}