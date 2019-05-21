package day12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FramesEg {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
//		driver.switchTo().frame(0);
//		driver.switchTo().frame(driver.findElement(By.xpath("//frameset[@title='Documentation frame']")));
		List<WebElement> f=driver.findElements(By.tagName("frame"));
		System.out.println(f.size());
		
		for (int i = 0; i < f.size(); i++)
		{
//			String x=f.get(i).getAttribute("name");
//			WebElement ele=driver.findElement(By.name(x));
			
			driver.switchTo().frame(i);
			
			try 
			{
				driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
				break;
			} catch (Exception e) 
			{
				System.out.println("The expected element not available in this frames");
			}
			driver.switchTo().defaultContent();
		}

	}

}
