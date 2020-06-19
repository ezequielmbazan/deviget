package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.awt.*;

public class homePage extends base {

    public homePage (WebDriver driver) {

        super(driver);
    }


    //Base URL
    String baseURL = "http://wwww.aliexpress.com";

    //Locators
    By title = By.className("logo-base");
    By searchField = By.name("SearchText");
    By searchButton = By.className("search-in-aliexpress");


    public homePage goToHomePage(){
        driver.get(baseURL);
        return this;
    }

    public void WriteOnSearchBox (String text){
        click(searchField);
        writeText(searchField,text);

    }

    public resultsPage clickSearch(){
        click(searchButton);
        return new resultsPage(driver);
    }

}
