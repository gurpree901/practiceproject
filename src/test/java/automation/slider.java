package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class slider {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		
		WebElement min_slider=driver.findElement(By.xpath("//div[@id='HTML7']//span[1]"));
		System.out.println("location of minslider"+min_slider.getLocation().getX());
		
		act.dragAndDropBy(min_slider, 100, 249);
		
		System.out.println("after moving the slider:"+min_slider.getLocation());

	}

}
