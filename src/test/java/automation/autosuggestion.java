package automation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestion {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium");
		
		List<WebElement > suto=driver.findElements(By.xpath("//ul[@class='G43f7e' and @role='listbox']//li//div[@class='wM6W7d']//span"));
		
		System.out.println(" "+suto.size());
		
		for(WebElement ss:suto)
		{
			
			System.out.println(" "+ss.getText());
			if(ss.getText().equals("selenium supplement"))
			{
				ss.click();
			}
		}

	}

}
