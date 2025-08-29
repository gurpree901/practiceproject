package automation;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptalertssh {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		/*WebElement Alert=driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		Alert.click();
		driver.switchTo().alert().accept();*/
		
		WebElement prompt=driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']"));
		 prompt.click();
		Alert al= driver.switchTo().alert();
		al.sendKeys("gurpreet");
		System.out.println(al.getText());
		
		WebElement status=driver.findElement(By.xpath("//p[@id='result']"));
		
		if(status.equals("gurpreet"))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed");
		}

	}

}
