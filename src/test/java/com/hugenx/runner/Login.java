package com.hugenx.runner;

import com.hugenx.Login.LoginScript;
import com.web.commonUtils.BaseClass;

import java.io.IOException;

import org.testng.annotations.Test;

public class Login extends BaseClass
{
	    @Test
      public void loginInToTheApplication() throws IOException, InterruptedException
      {
    	   LoginScript ls = new LoginScript(driver);
    	   ls.clickOnLoginBtn();
      }
}