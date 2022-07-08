import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S003_Pruef {

    public static void main(String[] arg) throws InterruptedException {

        WebDriver driver;

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.get("https://en.wikipedia.org/wiki/Selenium");

       String currentUrl = driver.getCurrentUrl();



        driver.findElement(By.xpath("//a[span='Create account']")).click();

        String currentUrl2 = driver.getCurrentUrl();

        System.out.printf("URL1::" + currentUrl + "\n");
        System.out.printf("URL2::" + currentUrl2 + "\n");

        if (currentUrl2.contains(currentUrl)){
            System.out.printf("URL2 is intern URL" + "\n");
        }
        else {
            System.out.printf("this is an extern URL" + "\n");
        }

        Thread.sleep(3000);

        driver.navigate().back();

        driver.findElement(By.xpath("//a[@title='Selenium (software)']")).click();

        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[contains(text(),'Official website')]")).click();

        String seleUrl = driver.getCurrentUrl();

        System.out.printf("SeleniumURL" + seleUrl + "\n");

        Thread.sleep(3000);

        driver.close();


    }
}
