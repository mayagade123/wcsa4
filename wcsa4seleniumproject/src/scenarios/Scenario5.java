package scenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//span[.='Allow']")).click();
		WebElement target = driver.findElement(By.xpath("//a[.='Rings ']"));
		Actions act=new Actions(driver);
		act.moveToElement(target).perform();
		WebElement diamond = driver.findElement(By.xpath("//body[@class='page-front new-hp-ui with-white-header no-footer-top    p-auto-play   no-ticker']"));
		
		String price = driver.findElement(By.xpath("//a[@id='pid_35071']")).getText();
		System.out.println(price);
		
}
}