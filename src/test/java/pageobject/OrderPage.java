package pageobject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static locators.Locators.*;

public class OrderPage {
    private final WebDriver driver;

    public OrderPage(WebDriver driver) {

        this.driver = driver;
    }
    public OrderPage inputMyName(String orderName){
        driver.findElement(By.cssSelector(INPUT_NAME_FIELD)).sendKeys(orderName);
        return this;
    }
    public OrderPage inputMySecondNames(String orderSecondName){
        driver.findElement(By.cssSelector(INPUT_SECOND_NAME_FIELD)).sendKeys(orderSecondName);
        return this;
    }
    public OrderPage inputMyStreet(String orderStreet){
        driver.findElement(By.cssSelector(INPUT_STREET)).sendKeys(orderStreet);
        return this;
    }
    public OrderPage inputMetroForOrder(){
        driver.findElement(By.cssSelector(INPUT_METRO)).click();
        driver.findElement(By.cssSelector(INPUT_METRO)).sendKeys(Keys.DOWN, Keys.ENTER);
        return this;
    }
    public OrderPage inputMyPhone(String orderStreet){
        driver.findElement(By.cssSelector(MOBILE)).sendKeys(orderStreet);
        return this;
    }
    public OrderPage nextOrderForm(){
        driver.findElement(By.xpath(BOTTOM_NEXT)).click();
        return this;
    }
    public OrderPage inputData() {
        driver.findElement(By.cssSelector(CLICK_DATA)).click();
        driver.findElement(By.cssSelector(PICK_DATA)).click();
        return this;
    }
    public OrderPage inputDaysArenda() {
        driver.findElement(By.cssSelector(CLICK_ARENDA)).click();
        driver.findElement(By.xpath(PICK_ARENDA)).click();
        return this;
    }
    public OrderPage clickChecboxBlack(){
        driver.findElement(By.xpath(CHECKBOX_BLACK)).click();
        return this;
    }
    public OrderPage myComment(String orderComment){
        driver.findElement(By.cssSelector(COMMENT)).sendKeys(orderComment);
        return this;
    }
    public OrderPage finishOrderForm() {
        driver.findElement(By.cssSelector(FINISH_ORDER)).click();
        driver.findElement(By.xpath(FINISH_ORDER_YES)).click();
        return this;
    }
    public OrderPage checkSuccessMessage(){
        Assert.assertTrue("Заказ не оформлен ",
                !driver.findElements(By.cssSelector(SUCCESS_MESSAGE)).isEmpty());
        return this;
    }

}
