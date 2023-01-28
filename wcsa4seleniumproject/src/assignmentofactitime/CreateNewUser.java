package assignmentofactitime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateNewUser {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			 WebDriver driver = new ChromeDriver();
			 driver.manage().window().maximize();
			 Thread.sleep(1000);
			 driver.get("http://desktop-dli52n7/administration/userlist.do");
			 Thread.sleep(1000);
			 driver.findElement(By.name("username")).sendKeys("admin");
			 Thread.sleep(1000);
			 driver.findElement(By.name("pwd")).sendKeys("manager");
			 Thread.sleep(1000);
			 driver.findElement(By.id("loginButton")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.cssSelector("input[value='Create New User']")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Developer");
			 Thread.sleep(1000);
			 driver.findElement(By.cssSelector("input[name='passwordText']")).sendKeys("pass@123");
			 Thread.sleep(1000);
			 driver.findElement(By.cssSelector("input[name='passwordTextRetype']")).sendKeys("pass@123");
			 Thread.sleep(1000);
			 driver.findElement(By.cssSelector("select[name='active']")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys("Maya");
			 Thread.sleep(1000);
			 driver.findElement(By.cssSelector("input[name='lastName']")).sendKeys("Gade");
			 Thread.sleep(1000);
			 driver.findElement(By.cssSelector("input[name='phone']")).sendKeys("7378842191");
			 Thread.sleep(1000);
			 driver.findElement(By.cssSelector("input[name='middleName']")).sendKeys("Ms.");
			 Thread.sleep(1000);
			 driver.findElement(By.cssSelector("input[name='mobile']")).sendKeys("7083702548");
			 Thread.sleep(1000);
			 driver.findElement(By.cssSelector("input[name='email']")).sendKeys("maya2000gade@gmail.com");
			 Thread.sleep(1000);
			 driver.findElement(By.cssSelector("input[name='workdayDurationStr']")).sendKeys("09:00");
			 Thread.sleep(1000);
			 driver.findElement(By.cssSelector("input[name='overtimeTracking']")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.cssSelector("input[name='overtimeTrackingLevel']")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.cssSelector("input[name='releaseDateStr']")).sendKeys("05/Dec/2023");
			 Thread.sleep(1000);
			 driver.findElement(By.cssSelector("input[type='submit']   ")).click();






		}		
}
