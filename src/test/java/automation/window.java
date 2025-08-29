package automation;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class window {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		String parent_win=driver.getWindowHandle();
		Set<String> allwinds=driver.getWindowHandles();
		
		for(String wind:allwinds)
		{
			if(!wind.equals(parent_win))
			{
				driver.switchTo().window(wind);
				System.out.println("title of the page"+driver.getTitle());
				
			}
		}

	}

}
