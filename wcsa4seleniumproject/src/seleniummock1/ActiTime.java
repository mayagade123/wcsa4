package seleniummock1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.get("http://desktop-dli52n7/login.do");
	WebElement ActiTimetitle = driver.findElement(By.xpath("//img[@src='/img/default/logo.gif?hash=1692528820']"));
	boolean status = ActiTimetitle.isDisplayed();
	System.out.println(status );
	Thread.sleep(2000);
	
	WebElement usn = driver.findElement(By.xpath("//input[@name='username']"));
	WebElement pwd = driver.findElement(By.xpath("//input[@name='pwd']"));
	usn.sendKeys("admin");
	pwd.sendKeys("manager");
	Thread.sleep(2000);
	
	usn.clear();
	pwd.clear();
}
}
