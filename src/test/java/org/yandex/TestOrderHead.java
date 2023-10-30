package org.yandex;

import pageobject.HomePage;
import pageobject.OrderPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestOrderHead {
    private WebDriver driver;
    private HomePage homePage;
    private OrderPage orderPage;

    private String myName;
    private String mySecondName;
    private String myStreet;
    private String myPhone;
    private String myComment;

    @Parameterized.Parameters
    public static Collection<String[]> testData() {
        return Arrays.asList(new String[][] {
                {"Сергей", "Бибиков", "Улица Пушкина 43", "+79371803991","Домофон не работает"},
                {"Вася", "Пупкин", "ул Краснодарская 1", "89371803992","Домофон работает"}

        });
    }

    public TestOrderHead(String myName, String mySecondName, String myStreet, String myPhone, String myComment) {
        this.myName = myName;
        this.mySecondName = mySecondName;
        this.myStreet = myStreet;
        this.myPhone = myPhone;
        this.myComment = myComment;
    }

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
        homePage = new HomePage(driver);
        orderPage = new OrderPage(driver);
    }

    @Test
    public void orderHead() {
        homePage
                .clickOrderButtonTop();
        orderPage
                .inputMyName(myName)
                .inputMySecondNames(mySecondName)
                .inputMyStreet(myStreet)
                .inputMetroForOrder()
                .inputMyPhone(myPhone)
                .nextOrderForm()
                .inputData()
                .inputDaysArenda()
                .clickChecboxBlack()
                .inputMyComment(myComment)
                .finishOrderForm()
                .checkSuccessMessage();
    }
    @Test
    public void orderBottom() {
        homePage
                .scroll()
                .clickOrderButtonBottom();
        /*
        orderPage

         */
    }
    @After
    public void tearDown() {
        driver.quit();
    }
}