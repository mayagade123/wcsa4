package flag;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag3 {
	static WebDriver driver;
  @Test(invocationCount=10)
  public void flag3() {
	  System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		 driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://desktop-dli52n7/login.do");
  
}
}