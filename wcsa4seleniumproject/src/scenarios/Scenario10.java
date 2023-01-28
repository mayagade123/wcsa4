package scenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario10 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//span[.='Not now']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='d-hotline h-btn animated zoomIn faster     ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='chat-fc-name']")).sendKeys("maya");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='chat-fc-email']")).sendKeys("gademaya4@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='chat-fc-phone']")).sendKeys("7083702548");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[.='Start Chat']")).click();
}
}