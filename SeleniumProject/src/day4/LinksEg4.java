package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksEg4 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com/sitemap.html");
		driver.manage().window().maximize();
		
		//Way 1
//		driver.findElement(By.xpath("//a[@href='home.aspx']")).click();
		
		//Way2
//		WebElement section=driver.findElement(By.xpath("//td[@style='height: 19px']"));
//		
//		List<WebElement> links=section.findElements(By.tagName("a"));
//		System.out.println(links.size());
//		
//		for (int i = 0; i < links.size(); i++) 
//		{
//			String name=links.get(i).getText();
//			System.out.println(name);
//			
//			if (name.equalsIgnoreCase("home"))
//			{
//				links.get(i).click();
//				break;
//			}
//		}

		//Way3
		driver.findElement(By.xpath("//td[@style='height: 19px']")).findElement(By.linkText("Home")).click();
	}

}
