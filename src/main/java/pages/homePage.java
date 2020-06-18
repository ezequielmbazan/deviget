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
    By previousButton = By.xpath("//button[@type='button'][0]");//By.xpath("//button[contains(text(),'Previous page, current page 1')]");
    By buttonPage2 = By.xpath("//button[@type='button'][2]");
    By modalCloseButton = By.className("next-dialog-close");



    public homePage goToHomePage(){
        driver.get(baseURL);
        return this;
    }

    public void WriteOnSearchBox (String text){
        click(searchField);
        writeText(searchField,text);

    }

    public void clickSearch(){
        click(searchButton);
    }

    public void closeModal(){
        click(modalCloseButton);
    }

    public homePage verifySecondPage(){
        String page;
        page = getAttributeValue(buttonPage2,"class");

        Assert.assertEquals(true, page.contains("next-current"));

        return this;
    }

    public void clickPage(String page){
        if (page.equals("2")) {
            click(buttonPage2);
        }

    }



}
