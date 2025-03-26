package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class BasePage {
public WebDriver driver;

public void BasePage(WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
}
