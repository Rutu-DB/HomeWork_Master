package com.nopcommerce.demo.testSuite;

import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class TopMenuTest extends TestBase {

    @Test
    public void selectMenu() {
        ArrayList<String> allLinks = new ArrayList<String>();
        allLinks.add("Computers");
        allLinks.add("Electronics");
        allLinks.add("Apparel");
        allLinks.add("Digital downloads");
        allLinks.add("Books");
        allLinks.add("Jewelry");
        allLinks.add("Gift Cards");
        Iterator iter = allLinks.iterator();
        while (iter.hasNext()) {
            String menu = String.valueOf(iter.next());
            System.out.println(menu);

            if (menu.contains("Computers")) {
                clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]"));
            }  if (menu.contains("Electronics")) {
                clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Electronics')]"));
            }  if (menu.contains("Apparel")) {
                clickOnElement(By.xpath("//div/ul[@class= 'top-menu notmobile']//a[contains(text(),'Apparel')]"));
            }  if (menu.contains("Digital downloads")) {
                clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[@href='/digital-downloads']"));
            }  if (menu.contains("Books")) {
                clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[@href='/books']"));
            }  if (menu.contains("Jewelry")) {
                clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[@href='/jewelry']"));
            }  if (menu.contains("Gift Cards")) {
                clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[@href='/gift-cards']"));
            }
        }

//        String menu = element.getText();
//        for (WebElement element : allLinks) {
//            if (menu.contains("Computers")) {
//                clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]"));
//            }
//            if (menu.contains("Electronics")) {
//                clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[contains(text(),'Electronics')]"));
//            }
//            if (menu.contains("Apparel")) {
//                clickOnElement(By.xpath("//div/ul[@class= 'top-menu notmobile']//a[contains(text(),'Apparel')]"));
//            } else if (menu.contains("Digital downloads")) {
//                clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[@href='/digital-downloads']"));
//            } else if (menu.contains("Books")) {
//                clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[@href='/books']"));
//            } else if (menu.contains("Jewelry")) {
//                clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[@href='/jewelry']"));
//            } else if (menu.contains("Gift Cards")) {
//                clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[@href='/gift-cards']"));
//            }
//        }
    }

//    @Test
//    public void verifyPageNavigation() {
//        selectMenu();

}

