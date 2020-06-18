import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest {



    public static void main (String[] args){


        //System.setProperty("webdriver.gecko.driver" , "/home/ezequiel/Downloads/geckodriver");
        //WebDriver driver = new FirefoxDriver();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.aliexpress.com/");


        driver.quit();

    }
}
