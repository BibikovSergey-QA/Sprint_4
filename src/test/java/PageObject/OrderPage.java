package PageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static Locators.Locators.*;

public class OrderPage {
    private final WebDriver driver;

    public OrderPage(WebDriver driver) {

        this.driver = driver;
    }
    public OrderPage InputMyName(String orderName){
        driver.findElement(By.xpath(inputNameField)).sendKeys(orderName);
        return this;
    }
    public OrderPage InputMySecondNames(String orderSecondName){
        driver.findElement(By.xpath(inputSecondNameField)).sendKeys(orderSecondName);
        return this;
    }
    public OrderPage InputMyStreet(String orderStreet){
        driver.findElement(By.xpath(inputStreet)).sendKeys(orderStreet);
        return this;
    }
    public OrderPage InputMyMetro(){
        driver.findElement(By.xpath(inputMetro)).click();
        driver.findElement(By.xpath(inputMetro)).sendKeys(Keys.DOWN, Keys.ENTER);
        return this;
    }
    public OrderPage InputMyPhone(String orderStreet){
        driver.findElement(By.xpath(Mobile)).sendKeys(orderStreet);
        return this;
    }
    public OrderPage Next(){
        driver.findElement(By.xpath(BOTTOM_NEXT)).click();
        return this;
    }
    public OrderPage InputMyData() {
        driver.findElement(By.xpath(CLICK_DATA)).click();
        driver.findElement(By.xpath(PICK_DATA)).click();
        return this;
    }
    public OrderPage InputMyArenda() {
        driver.findElement(By.xpath(CLICK_ARENDA)).click();
        driver.findElement(By.xpath(PICK_ARENDA)).click();
        return this;
    }
    public OrderPage MyChecboxBlack(){
        driver.findElement(By.xpath(CHECKBOX_BLACK)).click();
        return this;
    }
    public OrderPage MyComment(String orderComment){
        driver.findElement(By.xpath(COMMENT)).sendKeys(orderComment);
        return this;
    }
    public OrderPage FinishOrderForm(){
        driver.findElement(By.xpath(FINISH_ORDER)).click();
        driver.findElement(By.xpath(FINISH_ORDER_YES)).click();
        Assert.assertTrue("Заказ оформлен ",
                !driver.findElements(By.xpath(SUCCESS_MESSAGE)).isEmpty());
        return this;
    }
   /* public WebElement getOrderForm() {
        return driver.findElement(By.xpath(inputNameField));
    }

    public WebElement getSuccessMessage() {
        return driver.findElement(By.xpath(Locators.SUCCESS_MESSAGE));
    }

    */
}
