import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S002_GetCommands {

    public static void main(String[] arg) {

        WebDriver driver;
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
    }
}
