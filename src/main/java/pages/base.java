package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//This is the base page that contains some generic methods
public abstract class base {

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

    public String getAttributeValue(By elementBy, String attribute){
        return driver.findElement(elementBy).getAttribute(attribute);
    }

    public void closeModal(By elementBy){
        if(isElementPresent(elementBy)) {
            click(elementBy);
        }
    }


    public boolean isElementPresent(By elementBy) {
        try {
            driver.findElement(elementBy);
            return true;
        }
        catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

}
