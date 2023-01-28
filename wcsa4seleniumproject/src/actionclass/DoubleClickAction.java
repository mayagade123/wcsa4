package actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("http://desktop-dli52n7/administration/administration.do");
		Thread.sleep(1000);
		 driver.findElement(By.name("username")).sendKeys("admin");
		 Thread.sleep(1000);
		 driver.findElement(By.name("pwd")).sendKeys("manager");
		 Thread.sleep(1000);
		 driver.findElement(By.id("loginButton")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//div[.='Settings']")).click();
		 driver.findElement(By.xpath("//a[.='Logo & Color Scheme']")).click();
		 driver.findElement(By.xpath("//input[@id='uploadNewLogoOption']")).click();
		 WebElement target = driver.findElement(By.xpath("//input[@name='formCustomInterfaceLogo.logo']"));
		 Actions act = new Actions(driver);
		 act.doubleClick(target).perform();
}
}