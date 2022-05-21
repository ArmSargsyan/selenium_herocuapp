package org.theInternetTasks;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TestContextMenu {
    public WebDriver driver;

    public TestContextMenu(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void clickToContextMenu(){
        driver.get("https://the-internet.herokuapp.com");
        driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
        WebElement element = driver.findElement(By.linkText("Context Menu"));
        element.click();
    }

    public void clickToMouseRightButton() throws InterruptedException {
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//*[@id=\"hot-spot\"]"));
        actions.contextClick(element).perform();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(10));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String text = alert.getText();
        alert.accept();
    }
}
