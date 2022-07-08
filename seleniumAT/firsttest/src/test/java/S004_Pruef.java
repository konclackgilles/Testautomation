import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S004_Pruef {

    public static void main(String[] arg) throws InterruptedException {

        WebDriver driver;

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.get("https://www.amazon.com/customer-preferences/country?ref_=icp_lop_mop_chg_ais&preferencesReturnUrl=%2F&language=en_US");

       Boolean containSell = driver.getPageSource().contains("Sell");

       if (containSell){
           System.out.printf("I've found it");
       }

       else {
           System.out.printf("Sorry this element don't exist");
       }

       //boolean driver.findElement(By.xpath("//a[@class='nav-a  ' and @tabindex='0' and contains(text(),'Sell')]")).isDisplayed();
       driver.close();






    }
}
