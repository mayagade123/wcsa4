package dataDrivenFrameWork;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramValidCreds {
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.instagram.com/accounts/login/");
	Flib flib = new Flib();
	String username = flib.readExcelData("./data/InstagramLoginCreds.xlsx","validcreds", 1,0);
	
	String password = flib.readExcelData("./data/InstagramLoginCreds.xlsx","validcreds", 1,1);
	
	driver.findElement(By.name("username")).sendKeys(username);
	Thread.sleep(2000);
	 driver.findElement(By.name("password")).sendKeys(password);
	 Thread.sleep(2000);
	 driver.findElement(By.cssSelector("button [class$=' _ab9p _abcm']")).click();
	}
}
