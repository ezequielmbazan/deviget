package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class base {

    protected WebDriver driver;


    public base(WebDriver driver){
        this.driver = driver;
    }

    //Read method
    public String readText(By elementBY){
        return  driver.findElement(elementBY).getText();
    }

    //Click method
    public void click(By elementBY){
        driver.findElement(elementBY).click();
    }


    //Write method
    public void writeText(By elementBy, String text){
        driver.findElement(elementBy).sendKeys(text);
    }


}
