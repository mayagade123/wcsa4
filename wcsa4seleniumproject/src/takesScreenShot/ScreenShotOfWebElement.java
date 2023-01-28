package takesScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShotOfWebElement {
public static void main(String[] args) throws IOException, InterruptedException {
	System.setProperty("webriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.get("https://www.selenium.dev/downloads/");
	WebElement download = driver.findElement(By.xpath("//h1[.='Downloads']"));
	File src = download.getScreenshotAs(OutputType.FILE);
		Thread.sleep(2000);
	File dest = new File("./Screenshot/DownloadWebElementScreenShot.png");
	Files.copy(src, dest);
}
}
