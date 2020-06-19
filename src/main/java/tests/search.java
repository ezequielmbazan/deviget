package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import pages.homePage;
import pages.itemPage;
import pages.resultsPage;

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
        resultsPage rp = hp.clickSearch();


        Thread.sleep(5000);
        //close modal
        rp.closeModal();

        //scroll to bottom
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollTo(0,12800)");


        //select page 2 of results
        rp.clickPage("2");

        //scroll to bottom
        js.executeScript("window.scrollTo(0,12800)");

        //check if this is second page
        rp. verifySecondPage();

        //scroll to top
        js.executeScript("window.scrollTo(0,0)");
        Thread.sleep(15000);

        //verify if second ad is iphone
        itemPage ip = rp.gotoSecondItem();
        Thread.sleep(8000);

        //ip.closeModal();


        js.executeScript("window.scrollTo(0,300)");
        
        ip.verifyStock();


    }

}
