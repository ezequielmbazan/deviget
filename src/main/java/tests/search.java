package tests;

import org.testng.annotations.Test;

import pages.homePage;

import java.lang.annotation.Target;

public class search extends baseTest {

    @Test
    public void searchAndVerification() throws InterruptedException{
        homePage hp = new homePage(driver);
    }

}
