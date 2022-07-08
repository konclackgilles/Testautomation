import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S001_Xpath {

    public static void main(String[] arg) {

        WebDriver webDriver;
        WebDriverManager.chromedriver().setup();

        webDriver = new ChromeDriver();

        webDriver.get("http://demo.automationtesting.in/Register.html");
        webDriver.findElement(By.xpath("//input[@type='text' and @placeholder='First Name']")).sendKeys("Sidu");
        webDriver.findElement(By.xpath("//input[@type='text' and @placeholder='Last Name']")).sendKeys("Gilles");
        webDriver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("I've find a path of this element manually it's amazing");
        webDriver.findElement(By.xpath("//input[@type='radio' and @value='Male']")).click();

       Boolean selectMale =  webDriver.findElement(By.xpath("//input[@type='radio' and @value='Male']")).isSelected();



        if(selectMale){
            System.out.printf("we can now select Female Radio");

            webDriver.findElement(By.xpath("//input[@type='radio' and @value='FeMale']")).click();
        }


        //webDriver.findElement(By.xpath("//input[@type='radio' and @value='FeMale']")).click();

        webDriver.findElement(By.xpath("//input[@id='checkbox1']")).click();
        webDriver.findElement(By.xpath("//input[@id='checkbox2']")).click();
        //webDriver.findElement(By.xpath("//button[@type='submit']")).click();
        webDriver.findElement(By.xpath("//a[text()='WebTable']")).click();


    }
}
