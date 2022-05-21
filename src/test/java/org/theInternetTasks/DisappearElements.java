package org.theInternetTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class DisappearElements {
    public WebDriver driver;

    public DisappearElements(WebDriver driver) {
        this.driver = driver;
    }

    public void clickToDisEl(){
        driver.get("https://the-internet.herokuapp.com");
        driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
        WebElement element = driver.findElement(By.linkText("Disappearing Elements"));
        element.click();
    }
    public void clickSomeElements(){
        WebElement home = driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/a"));
        home.click();
        driver.navigate().back();
        WebElement about = driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/a"));
        about.click();
        driver.navigate().refresh();
        driver.navigate().back();
        driver.navigate().forward();
    }
}
