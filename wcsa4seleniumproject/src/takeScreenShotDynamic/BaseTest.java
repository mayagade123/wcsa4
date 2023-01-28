package takeScreenShotDynamic;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class BaseTest {
	static WebDriver driver;
	
  public void initialization() {
	  System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		 driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://desktop-dli52n7/login.do");
  }
  
  
  public void failed(String methodName)
  {
	  try{
			TakesScreenshot ts=(TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("./Screenshot/"+methodName+".png");
			Files.copy(src, dest);
	  }
	  catch(Exception e)
	  {
		 
	  }
  }
  
}
