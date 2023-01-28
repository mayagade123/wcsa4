package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NikeLoginPage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nike.com/my/member/profile/login?continueUrl=https://www.nike.com/my/");
		Thread.sleep(2000);
		driver.findElement(By.name("emailAddress")).sendKeys("jagrutither@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("jagruti@123");
		Thread.sleep(2000);
		driver.findElement(By.id("cd064355-243f-4246-8b91-1a18df69f761")).click();
	}

}
