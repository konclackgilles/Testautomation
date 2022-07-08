package de.banking.testcases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

    public String baseURL = "https://demo.guru99.com/v4/";
    public String userName = "mngr164225";
    public String password = "jahetAp";

    public static WebDriver driver;

    //WebDriverManager.chromedriver().setup();

    @BeforeClass
    public void setup(){

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);

        driver.manage().window().maximize();

    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
