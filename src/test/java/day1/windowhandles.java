package day1;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandles {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		String parent_id=driver.getWindowHandle();
		System.out.println("print id:"+parent_id);
		
		WebElement child_id=driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']"));
		child_id.click();
		
		Set<String> childd_id=driver.getWindowHandles();
		System.out.println("print parent id:"+childd_id);
		
		for( String w:childd_id)
		{
			driver.switchTo().window(parent_id);
		}

	}

}
