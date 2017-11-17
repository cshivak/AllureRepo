
/*A class that will contain all the helper methods needed for various tasks.*/

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelperMethods {
    /*This method when called will open up a chrome browser and navigate to the URL provided by the caller.
     * Arguments: URL (String)
     * Return Type: WebDriver
     * */
    WebDriver openChrome(String URL) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(URL);
        return driver;
        }
}