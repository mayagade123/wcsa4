package methodsofwebdriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class qu5 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.get("https://omayo.blogspot.com/");
	driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
	//how to maximize child window
	String parentTitle = driver.getTitle();
	System.out.println(parentTitle);
	System.out.println("-----------------------------");
	
	Set<String> allHandles = driver.getWindowHandles();
	Thread.sleep(2000);
	for(String wh:allHandles)
	{
		System.out.println(wh);
		if(!parentTitle.equals(wh))
		{
			WebDriver cw = driver.switchTo().window(wh);
			cw.manage().window().maximize();
			
		}
		else
		{
			driver.quit();
		}
	}
}
}
