package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class baseTest {
    public WebDriver driver;

    @BeforeClass
    public void setup() {

       driver = new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
       driver.manage().window().maximize();

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }


}
