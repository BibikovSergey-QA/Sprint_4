package org.yandex;

import PageObject.HomePage;
import PageObject.OrderPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestOrder {
    private WebDriver driver;
    private HomePage homePage;
    private OrderPage orderPage;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        homePage = new HomePage(driver);
        orderPage = new OrderPage(driver);
    }

    @Test
    public void OrderHead() {
// переход на страницу тестового приложения
        HomePage homePage = new HomePage(driver);
        homePage
                .clickOrderButtonTop();
        OrderPage orderPage = new OrderPage(driver);
        orderPage
                .InputMyName("Сергей")
                .InputMySecondNames("Бибиков")
                .InputMyStreet("Улица Пушкина 43")
                .InputMyMetro()
                .InputMyPhone("+79371803991")
                .Next()
                .InputMyData()
                .InputMyArenda()
                .MyChecboxBlack()
                .MyComment("домофон не работает")
                .FinishOrderForm();
 /*
        driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div[3]/input")).sendKeys("Улица Пушкина 43");

        driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div[4]/div/div/input")).click();
        driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div[4]/div/div/input")).sendKeys(Keys.DOWN, Keys.ENTER);

        driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div[5]/input")).sendKeys("+79371803991");

        driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[3]/button")).click();

        driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div[1]/div[1]/div/input")).click();
        driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div[1]/div[2]/div[2]/div/div/div[2]/div[2]/div[6]/div[1]")).click();

        driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div[2]/div/div[1]")).click();
        driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div[2]/div[2]/div[3]")).click();

        driver.findElement(By.xpath("//*[@id='black']")).click();

        driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[2]/div[4]/input")).sendKeys("домофон не работает");

        driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[3]/button[2]")).click();

        driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div[5]/div[2]/button[2]")).click();

        Assert.assertTrue("Заказ оформлен ",
                !driver.findElements(By.xpath("//*[@id='root']/div/div[2]/div[5]/div[1]")).isEmpty());

 */
    }
    @Test
    public void OrderBottom() {
        HomePage homePage = new HomePage(driver);
        homePage
                .clickOrderButtonBottom();
        OrderPage orderPage = new OrderPage(driver);
        orderPage
                .InputMyName("Сергей")
                .InputMySecondNames("Бибиков")
                .InputMyStreet("Улица Пушкина 43")
                .InputMyMetro()
                .InputMyPhone("+79371803991")
                .Next()
                .InputMyData()
                .InputMyArenda()
                .MyChecboxBlack()
                .MyComment("домофон не работает")
                .FinishOrderForm();
    }


    @After
    public void tearDown() {
        driver.quit();
    }
}
