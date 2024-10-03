package com.inetbanking.pageObject;

import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;

public class LoginPage extends BaseTest {
    @FindBy(xpath = "//input[@name='uid']")
    WebElement userid_txt;

    @FindBy(xpath = "//input[@name='password']")
    WebElement password_txt;
    @FindBy(xpath = "//input[@name='btnLogin']")
    WebElement login_btn;

    //Initializing the page object
    public LoginPage() throws IOException {
        PageFactory.initElements(driver, this); //this means current class object pointing to
    }

    public String validateLoginPageTitle() {
        return driver.getTitle();
    }

    //Since login page will redirect to the Homepage. this method will return homepage object
    public HomePage login(String uname, String password) throws IOException {
        userid_txt.sendKeys(uname);
        password_txt.sendKeys(password);
        login_btn.click();
        return new HomePage();
    }


}

