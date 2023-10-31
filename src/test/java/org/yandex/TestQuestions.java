package org.yandex;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobject.HomePage;

import java.util.Arrays;
import java.util.Collection;

import static locators.Locators.*;
import static org.junit.Assert.assertTrue;
@RunWith(Parameterized.class)
public class TestQuestions {
    private WebDriver driver;
    private String questionLocator;
    private String answerLocator;

    public TestQuestions(String questionLocator, String answerLocator) {
        this.questionLocator = questionLocator;
        this.answerLocator = answerLocator;
    }

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://qa-scooter.praktikum-services.ru/");

    }
    @After
    public void tearDown() {
        driver.quit();
    }
@Parameterized.Parameters
public static Collection<Object[]> data() {
    return Arrays.asList(new Object[][] {
            { FIRST_QUESTION, FIRST_QUESTION_TEXT },
            { SECOND_QUESTION, SECOND_QUESTION_TEXT },
            { QUESTION3, QUESTION_TEXT3 },
            { QUESTION4, QUESTION_TEXT4 },
            { QUESTION5, QUESTION_TEXT5 },
            { QUESTION6, QUESTION_TEXT6 },
            { QUESTION7, QUESTION_TEXT7 }
    });
}
    @Test
    public void testCheckAllQuestions() {

        HomePage homePage = new HomePage(driver);
        homePage
                .scroll()
        .clickQuestion(questionLocator);
        assertTrue(homePage.isAnswerDisplayed(answerLocator));

    }





}