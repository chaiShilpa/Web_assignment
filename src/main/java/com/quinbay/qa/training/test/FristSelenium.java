package com.quinbay.qa.training.test;
import com.quinbay.qa.training.Actions.HomePageActions;
import com.quinbay.qa.training.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;
public class FristSelenium {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/main/resources/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get("https://www.edgewordstraining.co.uk/demo-site/");
        Thread.sleep(3000);
        WebElement searchBox=driver.findElement(By.id("woocommerce-product-search-field-0"));
        searchBox.click();
        searchBox.sendKeys("Tshirt");
        searchBox.sendKeys(Keys.RETURN);
       List<WebElement> element=driver.findElements(By.xpath("//img[@src='https://www.edgewordstraining.co.uk/demo-site/wp-content/uploads/2018/03/vneck-tee.jpg']"));
        if(element.isEmpty()) {
            System.out.println("element not found");
        }
        else{
            System.out.println("\n\n Element found");
        }
        Thread.sleep(5000);
        WebElement Add_to_cart= driver.findElement(By.xpath("//a[@class='button product_type_simple add_to_cart_button ajax_add_to_cart']"));Add_to_cart.click();
        WebElement View_cart=driver.findElement(By.xpath("//a[@class='added_to_cart wc-forward']"));View_cart.click();
        Thread.sleep(5000);
        WebElement Proceed_to_pay=driver.findElement(By.xpath("//a[@class='checkout-button button alt wc-forward']"));Proceed_to_pay.click();
        WebElement Frist_name= driver.findElement(By.xpath("//input[@id='billing_first_name']"));Frist_name.sendKeys("chaitra");
        WebElement Last_name=driver.findElement(By.xpath("//input[@id='billing_last_name']"));Last_name.sendKeys("k");
        WebElement Billing_Address=driver.findElement(By.xpath("//input[@id='billing_address_1']"));Billing_Address.sendKeys("bengaluru");
        WebElement Billing_city=driver.findElement(By.xpath("//input[@id='billing_city']"));Billing_city.sendKeys("bengaluru");
     Thread.sleep(3000);
        WebElement State=driver.findElement(By.xpath("//select[@name='billing_state']"));
        Select sel=new Select(State);
      sel.selectByVisibleText("Karnataka");
       WebElement Pincode=driver.findElement(By.xpath("//input[@id='billing_postcode']")); Pincode.sendKeys("570007");
       WebElement Phone=driver.findElement(By.xpath("//input[@id='billing_phone']")); Phone.sendKeys("76354726278");
       WebElement Email=driver.findElement(By.xpath("//input[@id='billing_email']")); Email.sendKeys("chai@gmail.com");
      Thread.sleep(3000);
       WebElement Place_order=driver.findElement(By.xpath("//button[@id='place_order']"));Place_order.click();

       Thread.sleep(3000);
        driver.close();
    }
}
