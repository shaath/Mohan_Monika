package day4;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksEg5 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com/sitemap.html");
		driver.manage().window().maximize();
		
		Date d=new Date();
		System.out.println(d);
		DateFormat formate=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
//		System.out.println(formate.format(d));
		String x=formate.format(d);
		String y=((x.replace(" ", "")).replace(":", "")).replace("/","");
//		System.out.println(y);
		
		WebElement section=driver.findElement(By.xpath("//td[@style='height: 19px']"));
		
		List<WebElement> links=section.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for (int i = 0; i < links.size(); i++) 
		{
			String name=links.get(i).getText();
			System.out.println(name);
			links.get(i).click();
			Thread.sleep(5000);
			System.out.println(driver.getTitle()+"-----"+driver.getCurrentUrl());
				
			File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("E:\\Mohan_Monika_Recordings\\Workspace\\SeleniumProject\\src\\screenshots\\"+name+y+".png"));

			
			driver.navigate().back();
			section=driver.findElement(By.xpath("//td[@style='height: 19px']"));
			links=section.findElements(By.tagName("a"));
		}
		
		
		
		
	}
}
