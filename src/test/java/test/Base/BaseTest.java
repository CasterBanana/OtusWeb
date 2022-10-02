package test.Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected WebDriver driver;
    @BeforeMethod
    public void setUp(){
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("headless");
//        WebDriverManager.chromedriver().setup();// запускает драйвер chrome
//        driver = new ChromeDriver(options);
        WebDriverManager.chromedriver().setup();// запускает драйвер chrome
        driver = new ChromeDriver();


    }


    @AfterMethod
    public void setDown(){
        if(driver!= null)
            driver.quit();
    }
}
