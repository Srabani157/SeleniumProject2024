package com.inetbanking.pageObject;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class NewCustomerPage extends BaseTest {

    @FindBy(xpath="//input[@name='name']")
    WebElement customer_name_txt;
    @FindBy(xpath="//input[@name='rad1'][@value='f']")
    WebElement gender_female_radio;
    @FindBy(xpath="//input[@name='dob'][@id='dob']")
    WebElement dob_date;
    @FindBy(name="addr")
    WebElement address_txt;
    @FindBy(name="state")
    WebElement state_txt;
    @FindBy(name="pinno")
    WebElement pin_txt;
    @FindBy(name="telephoneno")
    WebElement phone_txt;
    @FindBy(name="emailid")
    WebElement email_txt;
    @FindBy(name="password")
    WebElement password_txt;

    @FindBy(xpath="//input[@value='Submit'][@name='sub']")
    WebElement submit_btn;

    public NewCustomerPage() throws IOException {
        PageFactory.initElements(driver,this);


    }
}
