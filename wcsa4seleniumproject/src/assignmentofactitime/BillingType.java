package assignmentofactitime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BillingType {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 Thread.sleep(1000);
		 driver.get("http://desktop-dli52n7/administration/btlist.do");
		 Thread.sleep(1000);
		 driver.findElement(By.name("username")).sendKeys("admin");
		 Thread.sleep(1000);
		 driver.findElement(By.name("pwd")).sendKeys("manager");
		 Thread.sleep(1000);
		 driver.findElement(By.id("loginButton")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.cssSelector("input[name='addLeaveType']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.cssSelector("input[name='name']")).sendKeys("Mahi");
		 Thread.sleep(1000);
		 driver.findElement(By.cssSelector("select[name='active']")).click();
		 Thread.sleep(1000);
		// driver.findElement(By.cssSelector("input[value='   Create Billing Type   ']")).click();
		 //Thread.sleep(1000);
		 driver.findElement(By.cssSelector("input[value='      Cancel      ']")).click();

}
		
}
