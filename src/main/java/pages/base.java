package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class base {

    WebDriver driver;


    public base(WebDriver driver){
        this.driver = driver;
    }

    public String readText(By elementBY){
        return  driver.findElement(elementBy).getText();
    }

}
