package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(name = "username")
    private WebElement username;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(xpath = "//h5[text()='Login']")
    private WebElement titleText;

    @FindBy(xpath = "//button[text()=' Login ']")
    private WebElement login;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void setUserName(String strUsername) {
        username.sendKeys(strUsername);
    }

    public void setPassword(String strPassword) {
        password.sendKeys(strPassword);
    }

    public void clickLogin() {
        login.click();
    }

    public String getLoginTitle() {
        return titleText.getText();
    }

    public void login(String strUserName, String strPassword) {
        setUserName(strUserName);
        setPassword(strPassword);
        clickLogin();
    }
}
