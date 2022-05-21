package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public WebDriver driver;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }


    @FindBy(xpath = "//*[@id=\"passp-field-login\"]")
    private WebElement loginField;

    @FindBy(xpath = "//*[@id=\"passp-field-passwd\"]")
    private WebElement passwdField;

    @FindBy(xpath = "//*[@id=\"passp:sign-in\"]")
    private WebElement loginBtn;


    public void clickLoginBtn(){
        loginBtn.click();
    }

    public void inputPasswd(String passwd){
        passwdField.sendKeys(passwd);
    }

    public void inputLogin(String login){
        loginField.sendKeys(login);
    }
}
