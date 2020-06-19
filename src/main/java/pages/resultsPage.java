package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.ArrayList;

public class resultsPage extends base {

    public resultsPage(WebDriver driver) {
        super(driver);
    }


    //Base URL
    String baseURL = "http://wwww.aliexpress.com";

    //Locators
    By previousButton = By.xpath("//button[@type='button'][0]");
    By buttonPage2 = By.xpath("//button[@type='button'][2]");
    By modalCloseButton = By.className("next-dialog-close");
    By secondItem;



    public resultsPage goToHomePage(){
        driver.get(baseURL);
        return this;
    }



    public void verifySecondPage(){
        String page;
        page = getAttributeValue(buttonPage2,"class");

        Assert.assertTrue(page.contains("next-current"));

    }

    public void clickPage(String page) {
        if (page.equals("2")) {
            click(buttonPage2);
        }
    }

    public itemPage gotoSecondItem(){
        secondItem = By.xpath("//ul/li[2]/div/div[2]/div/div/a");
        click(secondItem);
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        return new itemPage(driver);

    }

    public void closeModal()
    {
        closeModal(modalCloseButton);
    }

}
