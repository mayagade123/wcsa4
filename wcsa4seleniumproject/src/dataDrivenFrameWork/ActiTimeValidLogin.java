package dataDrivenFrameWork;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActiTimeValidLogin {
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("http://desktop-dli52n7/login.do");
	Flib flib = new Flib();
	String username = flib.readExcelData("./data/ActiTimeTestData.xlsx","validcreds",1,0);
	
	String password = flib.readExcelData("./data/ActiTimeTestData.xlsx","validcreds",1,1);
	driver.findElement(By.name("username")).sendKeys(username);
	Thread.sleep(2000);
	driver.findElement(By.name("pwd")).sendKeys(password);
	Thread.sleep(2000);
	driver.findElement(By.id("loginButton")).click();
	
	
}
}
