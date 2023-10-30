package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import static locators.Locators.ORDER_BUTTON_BOTTOM;
import static locators.Locators.ORDER_BUTTON_TOP;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {

        this.driver = driver;
    }

    public HomePage scroll() {
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
        return this;
    }
    public HomePage clickQuestion(String questionLocator) {
         driver.findElement(By.xpath(questionLocator)).click();
        return this;
    }

    public boolean isAnswerDisplayed(String answerLocator) {
        try {
            driver.findElement(By.xpath(answerLocator));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
    public HomePage clickOrderButtonBottom() {

        driver.findElement(By.cssSelector(ORDER_BUTTON_BOTTOM)).click();
        return this;
    }
    public HomePage clickOrderButtonTop() {
        driver.findElement(By.cssSelector(ORDER_BUTTON_TOP)).click();
        return this;
    }
}
