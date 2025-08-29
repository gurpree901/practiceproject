package automation;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class takescreenshto {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source_file=ts.getScreenshotAs(OutputType.FILE);
		File Target_file=new File(System.getProperty("user.dir")+"screenshot.fullpage.png");
		source_file.renameTo(Target_file);

	}

}
