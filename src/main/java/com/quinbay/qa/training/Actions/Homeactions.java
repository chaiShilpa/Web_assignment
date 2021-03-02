package com.quinbay.qa.training.Actions;

import com.quinbay.qa.training.pages.HomePage;
import com.quinbay.qa.training.pages.Xpath_page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Homeactions {
    Xpath_page xpath_page;

    public Homeactions(WebDriver driver) {
        xpath_page= PageFactory.initElements(driver, Xpath_page.class);

    }

    public void Search_item() {
        xpath_page.setSearchText();
        xpath_page.Search_iteam("tshirt");
        xpath_page.Click_on();
    }
    public void Add_cart_option(){
        xpath_page.Click_on_cart();
    }
    public void View_to_cart(){
        xpath_page.Click_View_cart();
    }
    public void Pay_to_Proceed_option(){
        xpath_page.Click_on_Payproceed();

    }
    public void Filling_From() throws InterruptedException {
        xpath_page.Fill_Name("chaitra");
        xpath_page.Fill_lastname("k");
        xpath_page.Fill_Address("bengaluru");
        xpath_page.Fill_City("begaluru");
        xpath_page.select_state();
        xpath_page.Enter_pincode("570007");
        xpath_page.Phone_number("76589403223");
        xpath_page.Email_enter("chai@gmail.com");
        Thread.sleep(3000);
        xpath_page.Click_pay();
    }

}
