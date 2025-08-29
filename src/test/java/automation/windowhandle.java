package automation;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandle {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		String parent_id=driver.getWindowHandle();
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set<String>allwinds=driver.getWindowHandles();
		
		for(String wi:allwinds)
		{
			if(!wi.equals(parent_id))
			{
				driver.switchTo().window(wi);
				System.out.println("print title of the page"+driver.getTitle());
			}
		}
		
				

	}

}
