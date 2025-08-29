package automation;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandles {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		String parent_win=driver.getWindowHandle();
		System.out.println(" parent window id"+parent_win);
		
		Set<String> allwindows=driver.getWindowHandles();
		System.out.println(" child wind"+parent_win);
		
		for(String wi:allwindows)
		{
			if(!wi.equals(parent_win))
			{
				driver.switchTo().window(wi);
				System.out.println("switch to child win:"+wi);
				System.out.println("title of page"+driver.getTitle());
				driver.close();
				
				
			}
		}

	}

}
