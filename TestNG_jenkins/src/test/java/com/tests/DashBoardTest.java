package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.pages.DashBoardPage;
import com.pages.LoginPage;

public class DashBoardTest extends BaseTest {
    LoginPage objLogin;
    DashBoardPage objDashBoardPage;

    @Test(priority = 0)
    public void dashBoardTest() {
        objLogin = new LoginPage(driver);
        objLogin.login("Admin", "admin123");

        objDashBoardPage = new DashBoardPage(driver);
        String actualText = objDashBoardPage.getHomePagetext();  
        Assert.assertEquals(actualText, "Dashboard");
    }
}
