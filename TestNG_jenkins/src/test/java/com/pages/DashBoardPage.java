package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {
    WebDriver driver;

    @FindBy(xpath = "//h6[text()='Dashboard']")
    WebElement homePageUserName;

    public DashBoardPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getHomePagetext() {
        return homePageUserName.getText();
    }
}
