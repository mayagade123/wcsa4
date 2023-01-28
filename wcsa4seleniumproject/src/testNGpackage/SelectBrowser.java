package testNGpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SelectBrowser {
	WebDriver driver;
	 @Test
	 @Parameters({"browserValue","url"})
  public void openBrowser(String browser) {
		 if( browser.equals("Firefox"))
		 {
		 System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		 }
		 
		 else if( browser.equals("chrome"))
		 {
			 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.google.com");
		 }
		 else {
			 Reporter.log("enter valid browserValue",true);
		 }
  }
}
