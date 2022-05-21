package org.theInternetTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DragAndDrop {
    public WebDriver driver;

    public DragAndDrop(WebDriver driver) {
        this.driver = driver;
    }
    public void clickDragAndDrop(){
        driver.get("https://the-internet.herokuapp.com");
        driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
        WebElement element = driver.findElement(By.linkText("Drag and Drop"));
        element.click();
    }

    public void aDragBDrop(){
        List<WebElement> dragList = driver.findElements(By.xpath("//*[@id=\"column-a\"]"));
        List<WebElement> dropList = driver.findElements(By.xpath("//*[@id=\"column-b\"]"));
        new Actions(driver).dragAndDrop(dragList.get(0),dropList.get(1)).perform();
    }
}
