package org.yandex;

import pageobject.HomePage;
import pageobject.OrderPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestOrderBottom {
    private WebDriver driver;
    private HomePage homePage;
    private OrderPage orderPage;
    String expectedUrl = "https://qa-scooter.praktikum-services.ru/order";
    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        homePage = new HomePage(driver);
        orderPage = new OrderPage(driver);
    }

    @Test
    public void orderBottom() {
        homePage
                .scroll()
                .clickOrderButtonBottom();
        orderPage
                .assertUrlOrder(expectedUrl);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}