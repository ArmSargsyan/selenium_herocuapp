package org.theInternetTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;

public class TestCases {

    public WebDriver driver;

    public TestCases(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void clickElement() {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get("https://the-internet.herokuapp.com");
        WebElement element = driver.findElement(By.linkText("Add/Remove Elements"));
        element.click();
    }

    public void clickAddElement() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath("//*[@id=\"content\"]/div/button"));
        element.click();
        Thread.sleep(3000);
    }

    public void clickDeleteElement() throws InterruptedException {
        WebElement element2 = driver.findElement(By.xpath("//*[@id=\"elements\"]/button"));
        element2.click();

    }
}
