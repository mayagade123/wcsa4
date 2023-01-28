package scenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class scenario7 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.bluestone.com/");
		WebElement target = driver.findElement(By.xpath("//a[.='All Jewellery ']"));
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
		driver.findElement(By.xpath("//a[.='Kadas']")).click();
		driver.findElement(By.xpath("(//img[@class='hc img-responsive center-block'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='buy-now']")).click();
		
		
		
		
}
}