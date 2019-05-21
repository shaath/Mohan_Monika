package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Auto {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("src")).sendKeys("D");
		Thread.sleep(5000);
		
		List<WebElement> citylist=driver.findElements(By.xpath("//ul[@class='autoFill']/li"));
		
		System.out.println(citylist.size());
		
		for (int i = 0; i < citylist.size(); i++)
		{
			String name=citylist.get(i).getText();
			System.out.println(name);
			
			if (name.equalsIgnoreCase("Dehradun"))
			{
				citylist.get(i).click();
				break;
			}
		}
	}

}
