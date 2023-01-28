package assignmentofactitime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Licenses {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 Thread.sleep(1000);
		 driver.get("http://desktop-dli52n7/administration/licensing/manage_licenses.do");
		 Thread.sleep(1000);
		 driver.findElement(By.name("username")).sendKeys("admin");
		 Thread.sleep(1000);
		 driver.findElement(By.name("pwd")).sendKeys("manager");
		 Thread.sleep(1000);
		 driver.findElement(By.id("loginButton")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.cssSelector("textarea[class='emptyCaption']")).sendKeys("admin admin admin");
		 Thread.sleep(1000);
		 driver.findElement(By.cssSelector("button[style='margin: 7px 0 7px 0']")).click();
		 Thread.sleep(1000);
		 driver.get ("http://desktop-dli52n7/administration/customization.do");
		 Thread.sleep(1000);
		 driver.findElement(By.cssSelector("select[name='colorScheme']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.cssSelector("input[id='uploadNewLogoOption']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.cssSelector("input[id='noReportLogo']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.cssSelector("input[value='Save Settings']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.cssSelector("input[value='Save Settings']")).click();
		 Thread.sleep(1000);
	}
}
