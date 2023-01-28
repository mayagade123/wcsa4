package assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentIphonebygetwindowhandle {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("iphone 14 pro max");
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	driver.findElement(By.xpath("//div[.='APPLE iPhone 14 Pro Max (Deep Purple, 128 GB)']")).click();
	//Thread.sleep(3000);
	//Set<String> handle = driver.getWindowHandles();
	//for(String win:handle)
	//{
		//driver.switchTo().window(win);
	//}
	//driver.findElement(By.xpath(""))
}
}
