package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage extends BasePage{
    public DashBoardPage(WebDriver driver) {
		super(driver);
		
	}

    @FindBy(xpath = "//h6[text()='Dashboard']")
    WebElement homePageUserName;



    public String getHomePagetext() {
        return homePageUserName.getText();
    }
}
