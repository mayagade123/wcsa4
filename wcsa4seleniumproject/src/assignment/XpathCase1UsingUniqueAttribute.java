package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCase1UsingUniqueAttribute {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login.php/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Akshaygingule@gmail.com");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Ak@shy123");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@name='login']")).click();
}
}

