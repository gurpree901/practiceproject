package automation;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandlessg {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		String parent_id=driver.getWindowHandle();
		Set<String> allwindows=driver.getWindowHandles();
		
		for(String wi:allwindows)
		{
			if(!wi.equals(parent_id))
			{
				driver.switchTo().window(wi);
				System.out.println("title of page"+driver.getTitle());
			}
		}

	}

}
