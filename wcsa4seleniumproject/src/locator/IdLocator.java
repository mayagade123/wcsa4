package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.name("txtUsername")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("txtPassword")).sendKeys("pass@123");
		Thread.sleep(2000);
		driver.findElement(By.id("btnLogin")).click();
	}
}

