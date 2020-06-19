package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import sun.awt.AWTIcon32_security_icon_bw16_png;

public class itemPage extends base {

    public itemPage(WebDriver driver) {
        super(driver);
    }

    //Locators
    By modalCloseButton2 = By.className("next-dialog-body");




    public void verifyStock(){

        WebElement element = driver.findElement(By.xpath("//div[@class='product-quantity clearfix']/div[2]/div[2]"));
        String q = element.getText().replaceAll("[^\\.0123456789]","");
        int quantity = Integer.parseInt(q);
        Assert.assertTrue(quantity>0,"Stock is available!");
    }

    public void closeModal()
    {
        closeModal(modalCloseButton2);
    }

}
