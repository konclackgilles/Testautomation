import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest {

    public static void main(String[] arg) {

        WebDriver webDriver;
        WebDriverManager.chromedriver().setup();

        webDriver = new ChromeDriver();

        webDriver.get("http://demo.automationtesting.in/Register.html");

        Boolean firstNameIsEnable = webDriver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).isEnabled();
        Boolean firstNameIsDisplayed = webDriver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).isDisplayed();

        if (firstNameIsEnable || firstNameIsDisplayed) {
            webDriver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("Gilles");
        }
        System.out.printf("True\n");


        Boolean lastNameIsEnable = webDriver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).isEnabled();
        Boolean lastNameIsDisplayed = webDriver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).isDisplayed();

        if (firstNameIsEnable && firstNameIsDisplayed) {
            webDriver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("Bertrand");
        }
        System.out.printf("True\n");

        Boolean adresseIsEnable = webDriver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).isEnabled();
        Boolean adresseIsDisplayed = webDriver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).isDisplayed();

        if (firstNameIsEnable && firstNameIsDisplayed) {
            webDriver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("MusterStraße");
        }
        System.out.printf("True\n");

        Boolean radioMale = webDriver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input")).isSelected();

        System.out.printf("trueeeeee");

        if (radioMale) {

            System.out.printf("trueyyyy");
            webDriver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input")).click();

            System.out.printf("Female Radio is selected\n");
        }


    }
}
