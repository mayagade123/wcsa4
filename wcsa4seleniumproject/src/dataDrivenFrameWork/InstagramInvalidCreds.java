package dataDrivenFrameWork;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramInvalidCreds {
  public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 WebDriver driver= new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 driver.get("https://www.instagram.com/accounts/login/");
	Flib flib = new Flib();
	int rc = flib.rowCount("./data/InstagramLoginCreds.xlsx","invalidcreds");
	for(int i=1;i<=rc;i++)
	{
		String username = flib.readExcelData("./data/InstagramLoginCreds.xlsx", "invalidcreds", i,0);
		
		String password = flib.readExcelData("./data/InstagramLoginCreds.xlsx","invalidcreds", i, 1);
		WebElement usn = driver.findElement(By.name("username"));
		usn.sendKeys(username);
		Thread.sleep(2000);
		
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys(password);
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("button [class$=' _ab9p _abcm']")).click();
		Thread.sleep(8000);
		
		
	    driver.findElement(By.name("username")).clear();
		}
	}
}
