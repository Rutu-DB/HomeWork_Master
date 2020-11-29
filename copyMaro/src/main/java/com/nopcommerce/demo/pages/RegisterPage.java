package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    HomePage homePage = new HomePage();

    By gender = By.xpath("//label[contains(text(),'Male')]");
    By firstName = By.xpath("//input[@id='FirstName']");

    By lastName = By.xpath("//input[@id='LastName']");

    By selectDate = By.xpath("//select[@name='DateOfBirthDay']//option[contains(text(),'11')]");

    By selectMonth = By.xpath("//select[@name='DateOfBirthMonth']//option[contains(text(),'November')]");

    By selectYear = By.xpath("//select[@name='DateOfBirthYear']//option[contains(text(),'2011')]");

    By emailField = By.xpath("//input[@id='Email']");

    By company = By.xpath("//input[@id='Company']");


    By newsLetter = By.xpath("//input[@id='Newsletter']");

    By password = By.xpath("//input[@id='Password']");


    By confirmPwd = By.xpath("//input[@id='ConfirmPassword']");

    By registerButton = By.xpath("//input[@id='register-button']");

    public void registration() {
        homePage.clickonRegisterLink();
        clickOnElement(gender);
        clickOnElement(firstName);
        sendTextToElement(firstName, "Alpha");
        sendTextToElement(lastName, "Beta");
        clickOnElement(selectDate);
        clickOnElement(selectMonth);
        clickOnElement(selectYear);
        clickOnElement(emailField);
        sendTextToElement(emailField, "alphatest@gmail.com");
        clickOnElement(company);
        sendTextToElement(company, "ABC Ltd");
        clickOnElement(newsLetter);
        clickOnElement(password);
        sendTextToElement(password, "123456");
        clickOnElement(confirmPwd);
        sendTextToElement(confirmPwd, "123456");
        clickOnElement(registerButton);

    }
}
