package Test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Page.HomePage;
import Page.RegisterPage;



public class RegisterTest extends BaseTest {
	HomePage objHome;
	RegisterPage objReg;
	
	
  @Test(dataProvider = "excelData", dataProviderClass = DPExcel.class)
  public void Register(String firstName, String lastName, String email, String password, String confirmPassword) {
	  objHome=new HomePage(driver);
	  objHome.register();
	  objReg=new RegisterPage(driver);
	  AssertJUnit.assertTrue(objReg.getRegisterPageText().contains("Register"));
	  objReg.setGender("male");
	    objReg.setFirstName(firstName);
	    objReg.setLastName(lastName);
	    objReg.setEmail(email);
	    objReg.setPassword(password);
	    objReg.setConfirmPassword(confirmPassword);
	    objReg.clickRegisterButton();

	  assertTrue(driver.getPageSource().contains("Your registration completed"), "Registration was not successful");
	  
  }
}