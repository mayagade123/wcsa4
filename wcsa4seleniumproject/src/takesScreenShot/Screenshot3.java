package takesScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class Screenshot3 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		EventFiringWebDriver efw = new EventFiringWebDriver(driver);
		efw.manage().window().maximize();
		efw.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	    efw.get("https://www.selenium.dev/downloads/");
		File src = efw.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/Screenshot3.jpg");
		Files.copy(src, dest);
	}
}