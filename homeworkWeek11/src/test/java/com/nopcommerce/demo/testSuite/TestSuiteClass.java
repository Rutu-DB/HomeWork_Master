package com.nopcommerce.demo.testSuite;

import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestSuiteClass extends TestBase {

    @Test
    public void verifyProductArrangeInAlphaBaticalOrder(){
        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]"));
        clickOnElement(By.xpath("//h2[@class='title']//a[contains(text(),'Desktops')]"));
        selectElementByValue(By.xpath("//select[@id='products-orderby']"),"Name: Z to A");


        String expectedResult1 = getTextFromElements(By.xpath("//a[contains(text(),'Lenovo IdeaCentre 600 All-in-One PC')]"));
        String expectedResult2 = getTextFromElements(By.xpath("//a[contains(text(),'Digital Storm VANQUISH 3 Custom Performance PC')]"));

    }
}
