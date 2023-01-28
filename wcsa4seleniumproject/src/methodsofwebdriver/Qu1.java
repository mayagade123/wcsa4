package methodsofwebdriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qu1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
		String parentHandle = driver.getWindowHandle();
		System.out.println(parentHandle);
		
		System.out.println("-----------------------------------------------------------");
		
		   Set<String> allHandles = driver.getWindowHandles();
		   Thread.sleep(5000);
	        for(String wh:allHandles)
	        {
	        	
	        	driver.switchTo().window(wh).quit();
	        	System.out.println(wh);
	        	Thread.sleep(5000);
	        	
	        }
	       
}
}