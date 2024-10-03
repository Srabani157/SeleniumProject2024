package com.inetbanking.pageObject;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class HomePage extends BaseTest {
    @FindBy(xpath = "//div/h2[text()='Guru99 Bank']")
    WebElement homePage_title;

    @FindBy(xpath = "//div/ul/li[a[contains(text(),'New Customer')]]")
    WebElement new_customer_menu;
    public HomePage() throws IOException {
        PageFactory.initElements(driver,this);
    }
    public String validateHomepageTitle(){
        return driver.getTitle();
    }

    public void clickOnNewCustomer(){
        new_customer_menu.click();
    }
}
