package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo  extends DPDemo{
	WebDriver driver;
//	@DataProvider(name = "testData")
//	public Object[][] dataProvFunc(){
//		return new Object[][] {{"Selenium"}, {"TestNG"}};
	//}
	@BeforeMethod
	public void setup() {
		System.out.println("Start the test");
		driver = new FirefoxDriver();
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
	}
  @Test(dataProvider = "testData")
  public void search(String keyWord) {
	  WebElement txtbox = driver.findElement(By.id("sb_form_q"));
	  txtbox.sendKeys(keyWord);
	  System.out.println("KeyWord Entred  : "+keyWord);
	  txtbox.sendKeys(Keys.ENTER);
	  System.out.println("Search result is Displayed");
	  System.out.println("--------------------------");

  }
  @AfterMethod
  public void Teardown() {
	  driver.quit();
  }
}
