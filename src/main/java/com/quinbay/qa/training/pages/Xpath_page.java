package com.quinbay.qa.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Xpath_page {
    WebDriver driver;

    public Xpath_page(WebDriver webDriver) {
        driver = webDriver;
    }

    @FindBy(id = "woocommerce-product-search-field-0")
    WebElement search_Box;
    @FindBy(xpath = "//a[@class='button product_type_simple add_to_cart_button ajax_add_to_cart']")
    WebElement Add_to_cart;
    @FindBy(xpath = "//a[@class='added_to_cart wc-forward']")
    WebElement View_cart;
   @FindBy(xpath = "//a[@class='checkout-button button alt wc-forward']")
    WebElement Pay_proceed;
    @FindBy(xpath = "//input[@id='billing_first_name']")
    WebElement Frist_name;
    @FindBy(xpath = "//input[@id='billing_last_name']")
    WebElement Last_name;
    @FindBy(xpath = "//input[@id='billing_address_1']")
    WebElement Address;
    @FindBy(xpath = "//input[@id='billing_city']")
    WebElement City;
    @FindBy(xpath = "//select[@name='billing_state']")
    WebElement State;
    @FindBy(xpath = "//input[@id='billing_postcode']")
    WebElement Pincode;
    @FindBy(xpath = "//input[@id='billing_phone']")
    WebElement phone;
    @FindBy(xpath = "//input[@id='billing_email']")
    WebElement Email;
    @FindBy(xpath ="//button[@id='place_order']")
    WebElement Pay_button;


    public void setSearchText() { search_Box.click();}
    public void Search_iteam(String item) {
        search_Box.sendKeys(item);
    }
    public void Click_on(){search_Box.sendKeys(Keys.RETURN); }
    public void Click_on_cart(){ Add_to_cart.click();}
    public void Click_View_cart(){ View_cart.click();}
    public void Click_on_Payproceed(){Pay_proceed.click();}
    public void Fill_Name(String name) { Frist_name.sendKeys(name);}
    public void Fill_lastname (String last){ Last_name.sendKeys(last);}
public void Fill_Address(String address){Address.sendKeys(address);}
public void Fill_City(String city_name){City.sendKeys(city_name);}
public void select_state(){ Select sel=new Select(State);
    sel.selectByVisibleText("Karnataka"); }
public void Enter_pincode(String code){Pincode.sendKeys(code);}
public void Phone_number(String number){phone.sendKeys(number);}
public void Email_enter(String Email_id){Email.sendKeys(Email_id);}
public void Click_pay(){Pay_button.click();}
        }

