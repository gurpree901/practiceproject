package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascripte {

    public static void main(String[] args) {
        // Set system property if needed
        // System.setProperty("webdriver.chrome.driver", "path-to-chromedriver");

        WebDriver driver = new ChromeDriver();

        try {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://testautomationpractice.blogspot.com/");
            driver.manage().window().maximize();

            JavascriptExecutor js = (JavascriptExecutor) driver;

            WebElement username = driv                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      er.findElement(By.xpath("//input[@id='name']"));

            // Set value via JS
            js.executeScript("arguments[0].setAttribute('value', 'amana')", username);

            // Optional: Verify the value was set
            String enteredValue = username.getAttribute("value");
            System.out.println("Entered value: " + enteredValue);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close browser after a delay for observation
            try { Thread.sleep(3000); } catch (InterruptedException e) {}
            driver.quit();
        }
    }
}
