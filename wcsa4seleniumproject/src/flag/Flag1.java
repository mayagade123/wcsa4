package flag;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Flag1 {
	static WebDriver driver;
	  @Test(description="this test case for sql")
	  public void sql() {
		  System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			 driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://www.google.com");
			driver.switchTo().activeElement().sendKeys("sql");
		 }
	}
