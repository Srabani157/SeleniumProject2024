package com.inetbanking.testcases;

import base.BaseTest;
import com.inetbanking.pageObject.HomePage;
import com.inetbanking.pageObject.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginPageTest extends BaseTest {
    static LoginPage loginPage;
    static HomePage homePage;

    LoginPageTest() throws IOException {
        super();
    }

    @BeforeTest
    public void SetUp() throws IOException {
        Initilization();
        loginPage = new LoginPage();

    }
    @Test(priority = 1)
    public void validateTitle() {
        String pageTitle = loginPage.validateLoginPageTitle();
        Assert.assertEquals(pageTitle, "Guru99 Bank Home Page");

    }
    @Test(priority = 2)
    public void loginTest() throws IOException {
        homePage = loginPage.login(locator.getProperty("sign_in_email_txt"), locator.getProperty("password_txt"));
    }

}


