package org.yandex;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static Locators.Locators.*;
import static org.junit.Assert.assertTrue;

public class TestQuestions {
    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");
    }

    @Test
    public void testCheckAllQuestions() {

        String[][] questionAndAnswers = {
                {FIRST_QUESTION, FIRST_QUESTION_TEXT},
                {SECOND_QUESTION, SECOND_QUESTION_TEXT},
                {QUESTION3, QUESTION_TEXT3},
                {QUESTION4, QUESTION_TEXT4},
                {QUESTION5, QUESTION_TEXT5},
                {QUESTION6, QUESTION_TEXT6},
                {QUESTION7, QUESTION_TEXT7}
        };

        for (String[] qa : questionAndAnswers) {
            String questionLocator = qa[0];
            String answerLocator = qa[1];
/*
            waitUntilPageLoaded();

 */

            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");

            WebElement questionElement = driver.findElement(By.xpath(questionLocator));
            questionElement.click();

            WebElement answerElement = driver.findElement(By.xpath(answerLocator));

            assertTrue(answerElement.isDisplayed());


        }
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

   /* private void waitUntilPageLoaded() {
        //код ожидания загрузки страницы
    }

    */
}