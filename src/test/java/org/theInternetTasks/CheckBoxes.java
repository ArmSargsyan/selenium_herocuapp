package org.theInternetTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class CheckBoxes {
    public WebDriver driver;

    public CheckBoxes(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void clickToCheckBox(){
        driver.get("https://the-internet.herokuapp.com");
        driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
        WebElement element = driver.findElement(By.linkText("Checkboxes"));
        element.click();
    }

    public void clickCheckBoxOne() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]"));
        Thread.sleep(100);
        element.click();
        WebElement element2 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]"));
        Thread.sleep(100);
        element2.click();
    }
}
