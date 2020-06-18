package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homePage extends base {

    public homePage (WebDriver driver) {
        super(driver);
    }


    //Base URL
    String baseURL = "http://wwww.aliexpress.com";

    //Locators
    By title = By.className("logo-base");
    By searchField = By.id("search-key");


    public homePage goToHomePage(){
        driver.get(baseURL);
        return this;
    }



}
