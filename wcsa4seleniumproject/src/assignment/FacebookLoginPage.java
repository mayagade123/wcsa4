package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginPage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("Akshaygingule@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("Ak@shy123");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(6000);
		driver.findElement(By.linkText("input[class='uiLinkButtonInput']")).click();
	}
}



