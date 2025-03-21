package com.test_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

	
	public class Priority {
	    WebDriver driver;


	    @Test
	    public void f() {
	        driver = new ChromeDriver();  // Initialize WebDriver once
	        driver.get("https://google.com");	    }

	    @Test(dependsOnMethods = {"f"})
	    public void f1() {
	        driver.findElement(By.name("q")).sendKeys("Depends on" + Keys.ENTER);
	    }
	    @Test(dependsOnMethods = {"f1"})
	    public void f2() {
	        
	            driver.quit();
	        
	    }
	}