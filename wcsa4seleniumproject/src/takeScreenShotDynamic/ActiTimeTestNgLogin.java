package takeScreenShotDynamic;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(CustomListener.class)
public class ActiTimeTestNgLogin extends BaseTest{
	@BeforeMethod
	public void setUp()
	{
		initialization();
	}
	
	
  @Test
  public void logInPage() throws InterruptedException {
	 SoftAssert sa = new SoftAssert();
	 String actualLoginPageTitle = driver.getTitle();
	 sa.assertEquals(actualLoginPageTitle,"actiTIME - Login");
	 driver.findElement(By.name("username")).sendKeys("admin");
	 Thread.sleep(2000);
	 driver.findElement(By.name("pwd")).sendKeys("manager");
	 Thread.sleep(2000);
	 driver.findElement(By.id("loginButton")).click();
 }
  
  @Test(priority=1)
  public void homePage() throws InterruptedException
  {
	  SoftAssert sa = new SoftAssert();
		 String actualLoginPageTitle = driver.getTitle();
		 sa.assertEquals(actualLoginPageTitle,"actiTIME - Login");
		 driver.findElement(By.name("username")).sendKeys("admin");
		 Thread.sleep(2000);
		 driver.findElement(By.name("pwd")).sendKeys("manager");
		 Thread.sleep(2000);
		 driver.findElement(By.id("loginButton")).click();
		 
		 Thread.sleep(2000);
		 String actualHomePageTitle = driver.getTitle();
		 Assert.assertEquals(actualHomePageTitle, "actiTIME - Time-Track");
		 Thread.sleep(2000);
  }
  @AfterMethod
  public void tearDown()
  {
	  driver.quit();
  }
  
}
