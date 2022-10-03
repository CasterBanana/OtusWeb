package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.Base.BaseTest;

import java.util.List;

public class OtusTest1 extends BaseTest {
    String duckduck = "https://duckduckgo.com/";
    String otus = "ОТУС";
    By button = By.xpath("//input[@type='submit']");
    String textOtus = "Онлайн‑курсы для профессионалов, дистанционное обучение современным ...";


    //        Открыть Chrome в headless режим
    @BeforeMethod
    @Override
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("headless");
        WebDriverManager.chromedriver().setup();// запускает драйвер chrome, установили драйвер
        driver = new ChromeDriver(options); // инициализация драйвера, что в драйвере именно хромдрайвер

    }

    @Test
    public void otusTest1() throws InterruptedException {
        //        Перейти на https://duckduckgo.com/
        driver.get(duckduck);
        //        В поисковую строку ввести ОТУС
        driver.findElement(By.xpath("//input[@class='js-search-input search__input--adv']")).sendKeys(otus);
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(2000);
        //        Проверить что в поисковой выдаче первый результат Онлайн‑курсы для профессионалов, дистанционное обучение // drive.findElements и использовать первый элемент массива 0 который xpath, который удовлетворяет под все записи
        //driver.findElement(By.linkText("Онлайн‑курсы для профессионалов, дистанционное обучение современным ...")).click();// открывает отус)
        //List<WebElement> links = driver.findElements(By.xpath("span[@class='EKtkFWMYpwzMKOYr0GYm LQVY1Jpkk8nyJ6HBWKAk']"));// тут мы все подходящие ссылки результата загоним в список
        //List<WebElement> links = driver.findElements(By.xpath("//div/h2[@class='LnpumSThxEWMIsDdAT17 CXMyPcQ6nDv47DKFeywM']"));
        List<WebElement> links = driver.findElements(By.xpath("//div//span[@class='EKtkFWMYpwzMKOYr0GYm LQVY1Jpkk8nyJ6HBWKAk']"));
        for (WebElement element : links) {
            System.out.println("Вывожу " + element.getText());
            System.out.println(element);
        }
        //System.out.println("Первый элемент списка " + toString(links.get(0)));
        System.out.println("Первый элемент списка " + links.get(0).getText());
        Assert.assertEquals(links.get(0).getText(),textOtus);
        //toString(links.get(0)).contains(textOtus);

        //Assert.assertEquals(toString(links.get(0)),textOtus);




    }


//    private String toString(WebElement webElement) {
//        return webElement.getText();
//    }
}
