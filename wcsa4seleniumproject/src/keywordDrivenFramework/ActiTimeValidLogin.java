package keywordDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeValidLogin {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://desktop-dli52n7/login.do");
		Flib flib = new Flib();
		String url = flib.readPropertyData("./data/config.properties","Url");
		
		String Username = flib.readPropertyData("./data/config.properties","Username");
		
		String Password = flib.readPropertyData("./data/config.properties","Password");
		Thread.sleep(2000);
		driver.get(url);
		 driver.findElement(By.name("username")).sendKeys(Username);
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(Password);
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		

}
}
