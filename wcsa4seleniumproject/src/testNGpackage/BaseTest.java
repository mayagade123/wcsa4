package testNGpackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
WebDriver driver;

 @BeforeMethod
 public void setUp()
 {
	 System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("http://desktop-dli52n7/login.do");
 }
 
 @AfterMethod
 public void tearDown()
 {
	 driver.quit();
 }
 
}
