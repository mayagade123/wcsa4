package flag;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Flag2 {
	static WebDriver driver;
	  @Test(enabled=false)
	  public void mt() {
		  System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			 driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://www.google.com");
			driver.switchTo().activeElement().sendKeys("Manual Testing");
		 }
	  @Test(enabled=true)
	  public void mt1() {
		  System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			 driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://www.google.com");
			driver.switchTo().activeElement().sendKeys("Manual Testing");
		 }
	}
