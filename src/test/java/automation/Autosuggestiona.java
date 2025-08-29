package automation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestiona {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium");
		List<WebElement> lists=driver.findElements(By.xpath("//ul[@class='G43f7e']//li//div[@class='wM6W7d']//span"));
		
	     for(WebElement li:lists)
	     {
	    	 if(li.getText().equals("selenium java"))
	    	 {
	    		 li.click();
	    	 }
	     }
		

	}

}
