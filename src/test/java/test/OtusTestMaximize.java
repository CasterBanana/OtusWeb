package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import test.base.BaseTest;

import java.time.Duration;

public class OtusTestMaximize extends BaseTest {

    @Test
    public void testOtus3() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://otus.ru");
        driver.findElement(By.xpath("//header//*[@data-modal-id='new-log-reg']")).click(); // Нажать кнопку авторизации
        WebElement wait = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions
                        .elementToBeClickable(By.xpath("//form/*/input[@type='text'][@placeholder='Электронная почта']")));
        wait.sendKeys("vosir52176@deitada.com");
        driver.findElement(By.xpath("//form/*/input[@type='password'][@placeholder='Введите пароль']"))
                .sendKeys("Azaza123#@");
        driver.findElement(By.xpath("//form/div/button[@type='submit' and contains(text(), 'Войти')]"))
                .click();
    }

}
