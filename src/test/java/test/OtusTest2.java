package test;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import test.Base.BaseTest;

import java.time.Duration;

public class OtusTest2 extends BaseTest {

    @Test
    public void otusTest2() throws InterruptedException {
        //driver.manage().window().fullscreen();
        //        Открыть Chrome в режиме киоска
        //        Перейти на сайт
        driver.get("https://demo.w3layouts.com/demos_new/template_demo/03-10-2020/photoflash-liberty-demo_Free/685659620/web/index.html?_ga=2.181802926.889871791.1632394818-2083132868.1632394818");

//        Нажать на любую картинку
        driver.findElement(By.xpath("//li[@data-id='id-1']/span/a[@class='image-zoom']")).click();
        Thread.sleep(3000);
//        Проверить что картинка открылась в модальном окне
        driver.findElement(By.xpath("//div[@class='pp_hoverContainer']"));
    }

}
