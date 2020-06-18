package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import pages.homePage;

import java.lang.annotation.Target;

public class search extends baseTest {

    @Test
    public void searchAndVerification() throws InterruptedException{

        //Create home page object
        homePage hp = new homePage(driver);

        //go to base url, in this case aliexpress home page
        hp.goToHomePage();

        //focus and write on search box
        hp.WriteOnSearchBox("iphone");

        //click on search button
        hp.clickSearch();

        //close modal
        hp.closeModal();

        //scroll to bottom
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollTo(0,12800)");


        //select page 2 of results
        hp.clickPage("2");

        //scroll to bottom
        js.executeScript("window.scrollTo(0,12800)");

        //check if this is second page
        hp.verifySecondPage();

    }

}
