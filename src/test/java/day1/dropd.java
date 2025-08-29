package day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;  // ✅ Correct List interface from Java Collections



public class dropd {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
	  WebElement 	dropdown=driver.findElement(By.xpath("//select[@id='country']"));
	  Select sc=new Select(dropdown);
	  sc.selectByVisibleText("France");
	 List<WebElement>  options=sc.getOptions();
	 
	 for( WebElement op:options)
	 {
		 System.out.println(op.getText());
	 }
	  

	}

}
