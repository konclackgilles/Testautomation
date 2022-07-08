import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class S002_Pruef {

    public static void main(String[] arg) throws InterruptedException {

        WebDriver driver;

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.get("https://gcreddy.com/project/create_account.php");

        driver.findElement(By.xpath("//input[@type='radio' and @value='m']")).click();
        driver.findElement(By.xpath("//input[@type='text' and @name='firstname']")).sendKeys("Koncl");
        driver.findElement(By.xpath("//input[@type='text' and @name='lastname']")).sendKeys("alex");
        driver.findElement(By.xpath("//input[@type='text' and @name='dob']")).sendKeys("21/10/1995");
        driver.findElement(By.xpath("//input[@type='text' and @name='email_address']")).sendKeys("gkonclackn@yahoo.fr");
        driver.findElement(By.xpath("//input[@type='text' and @name='street_address']")).sendKeys("musterstraße 2");
        driver.findElement(By.xpath("//input[@type='text' and @name='postcode']")).sendKeys("35647");
        driver.findElement(By.xpath("//input[@type='text' and @name='city']")).sendKeys("Frankfurt");
        driver.findElement(By.xpath("//input[@type='text' and @name='state']")).sendKeys("Hessen");
        driver.findElement(By.xpath("//input[@type='text' and @name='telephone']")).sendKeys("1236547");

        Select select = new Select(driver.findElement(By.xpath("//select[@name='country']")));

        select.selectByValue("5");

        //driver.findElement(By.xpath("//select[@name='country']"));

        driver.findElement(By.xpath("//input[@type='password' and @name='password']")).sendKeys("gilles789");
        driver.findElement(By.xpath("//input[@type='password' and @name='confirmation']")).sendKeys("gilles789");

        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Continue']")).click();

        Thread.sleep(3000);

        //driver.close();




    }
}
