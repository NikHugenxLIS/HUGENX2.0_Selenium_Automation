package com.hugenx.runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test
{
    public static void main(String[] args)
    {
        WebDriver d = new ChromeDriver();
        d.manage().window().maximize();
        d.get("https://test.limshugenx.com/#/authentication/login");


    }
}
