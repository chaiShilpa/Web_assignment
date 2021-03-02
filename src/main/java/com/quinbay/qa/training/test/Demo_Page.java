package com.quinbay.qa.training.test;

import com.quinbay.qa.training.Actions.Homeactions;
import com.quinbay.qa.training.pages.Xpath_page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Demo_Page {
    public static <Xpath_path> void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/main/resources/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get("https://www.edgewordstraining.co.uk/demo-site/");
        Homeactions action=new Homeactions(driver);
        action.Search_item();
        Thread.sleep(3000);
        action.Add_cart_option();
        action.View_to_cart();
        Thread.sleep(3000);
        action.Pay_to_Proceed_option();
        action.Filling_From();

    }
}
