package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class itemPage extends base {

    public itemPage(WebDriver driver) {
        super(driver);
    }


    By modalCloseButton2 = By.className("next-dialog-body");

    //Locators


    public int verifyStock(){

        WebElement element = driver.findElement(By.xpath("//div[@class='product-info']"));
        String q = element.getText();
        return 1;
    }

    public void closeModal()
    {
        closeModal(modalCloseButton2);
    }

}
