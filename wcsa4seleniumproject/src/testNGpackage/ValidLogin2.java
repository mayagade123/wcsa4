package testNGpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ValidLogin2 {
	WebDriver driver;
  @Test
  public void validLogin2(String browserValue) throws InterruptedException {
	  
	  if(browserValue.equals("firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("http://desktop-dli52n7/login.do");
			
			
			 driver.findElement(By.name("username")).sendKeys("admin");
			  Thread.sleep(2000);
			  driver.findElement(By.name("pwd")).sendKeys("manager");
			  Thread.sleep(2000);
			  driver.findElement(By.id("loginButton")).click();
	  }
	  
	  
	  else if(browserValue.equals("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("http://desktop-dli52n7/login.do");
			
			 driver.findElement(By.name("username")).sendKeys("admin");
			  Thread.sleep(2000);
			  driver.findElement(By.name("pwd")).sendKeys("manager");
			  Thread.sleep(2000);
			  driver.findElement(By.id("loginButton")).click();
		  }
	  else
	  {
		  Reporter.log("enter valid browserValue",true);
	  }
  }
  }

