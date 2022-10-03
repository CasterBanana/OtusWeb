package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import test.Base.BaseTest;

import java.time.Duration;

public class OtusTest3 extends BaseTest {

    @Test
    public void testOtus3() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://otus.ru");
        driver.findElement(By.xpath("//button[@class='header2__auth js-open-modal']")).click(); // Нажать кнопку авторизации
        WebElement wait = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//div/input[@type='text' and @name='email' and @placeholder='Электронная почта']")));
        driver.findElement(By.xpath("//div/input[@type='text' and @name='email' and @placeholder='Электронная почта']")).sendKeys("vosir52176@deitada.com");// ввести в поле логина логин
        driver.findElement(By.xpath("//div/input[@type='password' and @name='password' and @placeholder='Введите пароль']")).sendKeys("Azaza123#@");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div/button[@class='new-button new-button_full new-button_blue new-button_md' and @type='submit' and contains(text(), 'Войти')]")).click();
    }

}
