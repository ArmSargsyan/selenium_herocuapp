package org.example;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTest {

    public static LoginPage loginPage;
    public static ProfilePage profilePage;
    public static WebDriver driver;

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", ConfProperties.getProperty("chromedriver"));
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        profilePage = new ProfilePage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(ConfProperties.getProperty("loginpage"));

    }

    @Test
    public void loginTest() {
        loginPage.inputLogin("wwwando@yandex.ru");
        loginPage.clickLoginBtn();
        loginPage.inputPasswd("wwwando222");
        loginPage.clickLoginBtn();

        String user = profilePage.getUserName();

        Assert.assertEquals("wwwando@yandex.ru",user);
    }

    @AfterClass
    public static void tearDown(){
        profilePage.entryMenu();
        profilePage.userLogout();
        driver.quit();
    }
}