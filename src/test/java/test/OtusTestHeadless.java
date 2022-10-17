package test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import test.base.BaseTest;

import java.util.List;

public class OtusTestHeadless extends BaseTest {
  private String duckduck = "https://duckduckgo.com/";
  private String otus = "ОТУС";
  private String textOtus = "Онлайн‑курсы для профессионалов, дистанционное обучение современным ...";

    @Test
    public void otusTest1() throws InterruptedException {
        //        Открыть Chrome в headless режим
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        //        Перейти на https://duckduckgo.com/
        driver.get(duckduck);
        //        В поисковую строку ввести ОТУС
        WebElement searchField = driver.findElement(By.xpath("//input[@type='text']"));
        searchField.sendKeys(otus);
        WebElement searchButton = driver.findElement(By.xpath("//input[@type='submit']"));
        searchButton.click();
        //        Проверить что в поисковой выдаче первый результат Онлайн‑курсы для профессионалов, дистанционное обучение // drive.findElements и использовать первый элемент массива 0 который xpath, который удовлетворяет под все записи
        List<WebElement> links = driver.findElements(By.xpath("//div//h2/a[@href='https://otus.ru/']"));
        Assert.assertEquals(links.get(0).getText(),textOtus);
    }
}
