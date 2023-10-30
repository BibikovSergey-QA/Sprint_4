package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import static Locators.Locators.ORDER_BUTTON_BOTTOM;
import static Locators.Locators.ORDER_BUTTON_TOP;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {

        this.driver = driver;
    }


    public HomePage clickOrderButtonBottom() {
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
        driver.findElement(By.xpath(ORDER_BUTTON_BOTTOM)).click();
        return this;
    }
    public HomePage clickOrderButtonTop() {
        driver.findElement(By.xpath(ORDER_BUTTON_TOP)).click();
        return this;
    }
}
