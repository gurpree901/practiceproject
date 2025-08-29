package automation;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenlinks {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(" size of links"+links.size());
		
		for(WebElement ll:links)
		{
			String ss=ll.getAttribute("href");
			
			if(ss.isEmpty()|| ss==null)
			{
				System.out.println(" not able to found ");
			}
			
			URL ul=new URL(ss);
			
			HttpURLConnection res=(HttpURLConnection) ul.openConnection();
			res.connect();
			if(res.getResponseCode()>400)
			{
				System.out.println(" broken links"+ss);
			}
			else
			{
				System.out.println("not broken");
			}

	

		}
		

	}

}
