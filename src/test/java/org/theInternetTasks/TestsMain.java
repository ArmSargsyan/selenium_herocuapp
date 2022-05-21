package org.theInternetTasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class TestsMain {

    public static WebDriver driver;
    public static ChromeOptions options;
    TestCases testCases = new TestCases(driver);
    TestContextMenu testContextMenu = new TestContextMenu(driver);
    CheckBoxes checkBox = new CheckBoxes(driver);
    DisappearElements disappearElements = new DisappearElements(driver);
    DragAndDrop dragAndDrop = new DragAndDrop(driver);

    //    @BeforeClass
    public void setup() {
        options = new ChromeOptions();
        options.addArguments("--incognito");
//        options.addArguments("--start-maximized");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.get("https://google.com");
        testCases = new TestCases(driver);
        testContextMenu = new TestContextMenu(driver);
        checkBox = new CheckBoxes(driver);
        disappearElements = new DisappearElements(driver);
        dragAndDrop = new DragAndDrop(driver);
//         ((JavascriptExecutor)driver).executeScript("window.open();");

    }

//    @Test
//    public void addDel() throws InterruptedException {
//        setup();
//        testCases.clickElement();
//        testCases.clickAddElement();
//        testCases.clickDeleteElement();
//    }

//    @Test
//    public void clickMouse() throws InterruptedException {
//        setup();
//        testContextMenu.clickToContextMenu();
//        testContextMenu.clickToMouseRightButton();
//    }

//    @Test
//    public void checkBox() throws InterruptedException {
//        setup();
//        checkBox.clickToCheckBox();
//        checkBox.clickCheckBoxOne();
//    }

    @Test
    public void disEl(){
        setup();
        disappearElements.clickToDisEl();
        disappearElements.clickSomeElements();
    }

    @Test
    public void dragDrop(){
        setup();
        dragAndDrop.clickDragAndDrop();
        dragAndDrop.aDragBDrop();
    }
}
