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
        WebElement form = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.cssSelector("form.js-login")));
        WebElement emailField = form.findElement(By.xpath(".//input[@type='text'][@placeholder='Электронная почта']"));
        emailField.sendKeys("vosir52176@deitada.com");
        WebElement passwordField = form.findElement(By.xpath("//form/*/input[@type='password'][@placeholder='Введите пароль']"));
        passwordField.sendKeys("Azaza123#@");
        WebElement openButton = form.findElement(By.xpath("//form/div/button[@type='submit' and contains(text(), 'Войти')]"));
        openButton.click();
    }

}
