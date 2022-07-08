package de.banking.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageTestCase {

    WebDriver driver;

    public LoginPageTestCase(WebDriver rDriver){

        driver = rDriver;
        PageFactory.initElements(rDriver, this);
    }

    @FindBy(name = "uid")
    @CacheLookup
    WebElement txtUserName;

    @FindBy(name = "password")
    @CacheLookup
    WebElement txtPassword;

    @FindBy(name = "btnLogin")
    @CacheLookup
    WebElement btnLogin;

    @FindBy(name = "save")
    @CacheLookup
    WebElement btnCookie;

    //button[@id='save']

    public void setTxtUserName(String userName){
        txtUserName.sendKeys(userName);
    }

    public void setTxtPassword(String password){
        txtPassword.sendKeys(password);
    }

    public void clickSubmit(){
        btnLogin.click();
    }

    public void clickCookie(){
        btnCookie.click();
    }


}
