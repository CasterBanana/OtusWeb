package test;


import org.openqa.selenium.By;
import org.testng.annotations.Test;
import test.base.BaseTest;

public class OtusTestFullscreen extends BaseTest {
    protected String handle2;
    @Test
    public void otusTest2() throws InterruptedException {
        //        Открыть Chrome в режиме киоска
        driver.manage().window().fullscreen();
        //        Перейти на сайт
        driver.get("https://demo.w3layouts.com/demos_new/template_demo/03-10-2020/photoflash-liberty-demo_Free/685659620/web/index.html?_ga=2.181802926.889871791.1632394818-2083132868.1632394818");
//        Нажать на любую картинку
        driver.findElement(By.xpath("//li[@data-id='id-1']/span/a[@class='image-zoom']")).click();
//        Проверить что картинка открылась в модальном окне
        handle2 = driver.getWindowHandle(); // получить handle открытого окна
        driver.switchTo().window(handle2); // официально переключися на него)))
        driver.findElement(By.xpath("//div[@class='pp_hoverContainer']"));
    }

}
