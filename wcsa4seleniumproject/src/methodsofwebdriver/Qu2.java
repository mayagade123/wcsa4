package methodsofwebdriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Qu2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://omayo.blogspot.com/");
		//how to close child and parent browser without using quite method
		driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
		String parentHandle = driver.getWindowHandle();
		System.out.println(parentHandle);
		
		System.out.println("-----------------------------------------------------------");
		
		   Set<String> allHandles = driver.getWindowHandles();
		   Thread.sleep(2000);
	        for(String wh:allHandles)
	        {
	        	System.out.println(wh);
	        	driver.switchTo().window(wh).close();
	        	
	        }
	        	
	        }
}
