package org.yandex;

import pageobject.HomePage;
import pageobject.OrderPage;
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
    public void orderHead() {
// переход на страницу тестового приложения
        HomePage homePage = new HomePage(driver);
        homePage
                .clickOrderButtonTop();
        OrderPage orderPage = new OrderPage(driver);
        orderPage
                .inputMyName("Сергей")
                .inputMySecondNames("Бибиков")
                .inputMyStreet("Улица Пушкина 43")
                .inputMetroForOrder()
                .inputMyPhone("+79371803991")
                .nextOrderForm()
                .inputData()
                .inputDaysArenda()
                .clickChecboxBlack()
                .myComment("домофон не работает")
                .finishOrderForm()
                .checkSuccessMessage();

    }
    @Test
    public void orderBottom() {
        HomePage homePage = new HomePage(driver);
        homePage
                .scroll()
                .clickOrderButtonBottom();
        OrderPage orderPage = new OrderPage(driver);
        orderPage
                .inputMyName("Сергей")
                .inputMySecondNames("Бибиков")
                .inputMyStreet("Улица Пушкина 43")
                .inputMetroForOrder()
                .inputMyPhone("+79371803991")
                .nextOrderForm()
                .inputData()
                .inputDaysArenda()
                .clickChecboxBlack()
                .myComment("домофон не работает")
                .finishOrderForm()
                .checkSuccessMessage();
    }


    @After
    public void tearDown() {
        driver.quit();
    }
}
