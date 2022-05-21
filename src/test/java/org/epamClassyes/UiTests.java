package org.epamClassyes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class UiTests {
    public static void main(String[] args) throws InterruptedException, AWTException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        // options.addArguments("--start-maximized");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://google.com");

//        Dimension dim = new Dimension(720, 480);
//        driver.manage().window().setSize(dim);
//        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
//        driver.manage().timeouts().pageLoadTimeout(7,TimeUnit.MILLISECONDS);
//        driver.manage().timeouts().scriptTimeout(7);
//        WebElement element = driver.findElement(By.name("q"));
//
//        element.sendKeys("gyumri");

        // element.sendKeys(Keys.ENTER);

//        ((JavascriptExecutor) driver).executeScript("window.open();");
//        driver.get("https://wiki.com");





//        driver.navigate().to("https://wikipedia.org");

        // driver.switchTo().window("chrome://newtab");
        // System.out.println(driver.getPageSource());
        // driver.close();

//        Thread.sleep(3000);
//        driver.quit();
    }
}
