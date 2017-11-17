import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.Keys;

public class FirstTest
{
    @Test
    public void loginSalesForce() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://google.com/");
        WebElement google = driver.findElement(By.xpath("//*[@id=\"lst-ib\"]"));
        google.click();
        google.sendKeys("Hello World");
        google.sendKeys(Keys.RETURN);

    }
}