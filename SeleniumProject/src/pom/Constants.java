package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class Constants 
{
	public static String url="http://orangehrm.qedgetech.com";
	public static String u="Admin",p="Qedge123!@#";
	
	public static WebDriver driver=new FirefoxDriver();
	public static OrgHRM_LoginPage oh=PageFactory.initElements(driver, OrgHRM_LoginPage.class);
	public static AdminHomePage ap=PageFactory.initElements(driver, AdminHomePage.class);
}