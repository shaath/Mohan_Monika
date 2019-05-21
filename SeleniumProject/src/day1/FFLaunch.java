package day1;

import org.openqa.selenium.firefox.FirefoxDriver;


public class FFLaunch {

	public static void main(String[] args) 
	{
//		System.setProperty("webdriver.gecko.driver", "F:\\Cdownloads/geckodriver.exe");
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		
		
	}

}
