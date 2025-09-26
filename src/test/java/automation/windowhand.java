package automation;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhand {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(text(),'Orange')]")).click();
		String parent_id=driver.getWindowHandle();
		Set<String> allwinds=driver.getWindowHandles();
		
		for(String win:allwinds)
		{
			if(win.equals(allwinds))
			{
				driver.switchTo().window(win);
				System.out.println(driver.getTitle());
			}

	



		}
		
		

	}

}
