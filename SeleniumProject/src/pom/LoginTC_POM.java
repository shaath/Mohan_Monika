package pom;

import org.testng.annotations.Test;


public class LoginTC_POM extends Constants
{
	@Test
	public void login() throws InterruptedException
	{
		
		driver.get(url);
		
		oh.org_Login(u,p);
		
		Thread.sleep(3000);
		
		
		ap.welcomeclick();
		ap.logoutclick();
		
		driver.close();
	}

}
