package Test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import Page.HomePage;


public class HomeTest extends BaseTest {
HomePage objHome;
	 @Test(priority = 0)
	  public void loginTest() {
		  objHome=new HomePage(driver);
		  String loginPageTitle=objHome.getLoginPageText();
		  AssertJUnit.assertTrue(loginPageTitle.contains("Welcome to the new Tricentis store!"));
	  }

}