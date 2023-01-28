package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZomatoLoginPage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomatobook.com/account/login.aspx");
		Thread.sleep(2000);
		driver.findElement(By.name("ctl00$MainContent$LoginControl$UserName")).sendKeys("jagruti");
		Thread.sleep(2000);
		driver.findElement(By.id("MainContent_LoginControl_Password")).sendKeys("jagruti@123");
		Thread.sleep(2000);
		driver.findElement(By.id("MainContent_LoginControl_btnLogin")).click();
	}
}

