package test.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected WebDriver driver;
    protected Logger logger = LogManager.getLogger(BaseTest.class);
    @BeforeMethod
    public void setUp(){
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("headless");
//        WebDriverManager.chromedriver().setup();// запускает драйвер chrome
//        driver = new ChromeDriver(options);
        WebDriverManager.chromedriver().setup();// запускает драйвер chrome
        driver = new ChromeDriver();
        logger.info("Драйвер поднят");


    }


    @AfterMethod
    public void setDown(){
        if(driver!= null)
            driver.quit();
    }
}
