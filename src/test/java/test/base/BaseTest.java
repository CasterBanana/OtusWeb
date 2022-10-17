package test.base;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


public abstract class BaseTest {

    protected WebDriver driver;
    protected Logger logger = LogManager.getLogger(BaseTest.class);
    @BeforeSuite
    public void setUp(){
        WebDriverManager.chromedriver().setup();// скачивает драйвер chrome
        driver = new ChromeDriver();
        logger.info("Драйвер поднят");
    }


    @AfterSuite
    public void setDown(){
        if(driver!= null)
            driver.quit();
    }
}
