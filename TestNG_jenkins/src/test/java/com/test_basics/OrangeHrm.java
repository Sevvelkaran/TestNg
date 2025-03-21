package com.test_basics;

import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class OrangeHrm {
	WebDriver driver;
  @Test
  @Parameters({"browser"})
  public void parametertest(String browser) {
	  if(browser.equals("chrome")) {
		  driver=new ChromeDriver();
	  }else if(browser.equals("firefox")) {
		  driver=new FirefoxDriver();
		  
	  }else if(browser.equals("edge")) {
		  driver=new EdgeDriver();
	  }
	  driver.manage().window().maximize();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }
  
  @Test
  @Parameters({"val1", "val2"})
  public void parametertest(String val1, String val2) {
	  
	  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(val1);
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(val2);
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
  }
  
  
}
