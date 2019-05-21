package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MoueHoverAg {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement cat=driver.findElement(By.id("nav-link-shopall"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(cat).build().perform();
		Thread.sleep(5000);
		WebElement mob=driver.findElement(By.xpath("//span[@ aria-label='Mobiles, Computers']"));
		act.moveToElement(mob).build().perform();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Power Banks']")).click();

	}

}
