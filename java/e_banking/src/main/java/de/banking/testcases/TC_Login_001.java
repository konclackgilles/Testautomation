package de.banking.testcases;

import de.banking.pageobject.LoginPageTestCase;
import de.banking.testcases.BaseClass;
import org.openqa.selenium.Cookie;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class TC_Login_001 extends BaseClass {

    @Test(priority = 1)

    public void loginTest() throws InterruptedException {

        driver.get(baseURL);

      /*  driver.manage().deleteAllCookies();
       Set<Cookie> cookiesList = driver.manage().getCookies();
       for (Cookie getCookies:cookiesList){
           System.out.println(getCookies);
       }*/

        Thread.sleep(3000);



        LoginPageTestCase lp = new LoginPageTestCase(driver);

        Thread.sleep(3000);

        lp.clickCookie();

        Thread.sleep(3000);

        lp.setTxtUserName(userName);
        Thread.sleep(3000);
        lp.setTxtPassword(password);
        Thread.sleep(3000);

        lp.clickSubmit();
/*
        if (driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
            Assert.assertTrue(true);

            System.out.printf("true");
        }

        else {
            Assert.assertTrue(false);
            System.out.printf("false");
        }*/

    }


}
