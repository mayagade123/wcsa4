package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorActiTime {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 Thread.sleep(2000);
	 driver.get("http://desktop-dli52n7/login.do");
	 Thread.sleep(2000);
	 driver.findElement(By.name("username")).sendKeys("admin");
	 Thread.sleep(2000);
	 driver.findElement(By.name("pwd")).sendKeys("manager");
	 Thread.sleep(2000);
	 driver.findElement(By.id("loginButton")).click();
}
}
