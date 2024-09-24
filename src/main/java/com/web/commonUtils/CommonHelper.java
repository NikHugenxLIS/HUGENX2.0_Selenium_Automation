package com.web.commonUtils;

import com.web.hugenx_pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;

public class CommonHelper
{
    LoginPage loginpage;
    FileUtility fileutility;
    ExcelDataDriven excelDataDriven;
    public CommonHelper(WebDriver driver)
    {
        loginpage = new LoginPage(driver);
        fileutility = new FileUtility();
        excelDataDriven = new ExcelDataDriven();
    }

    public void loginToApplication(Duration timeoutInSeconds) throws IOException, InterruptedException {
        ArrayList<String> data = excelDataDriven.getData("Login");

        //Assert.assertEquals(loginpage.getLoginBtnText(), "LOGIN","Login Page is not Loaded as LOGIN Btn is not displayed");
        loginpage.enterUsername(data.get(1), timeoutInSeconds);
        loginpage.enterPassword(data.get(2));
        loginpage.clickLoginButton();
    }
}
