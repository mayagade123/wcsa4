package methodsofwebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValueMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 WebElement loginButton = driver.findElement(By.xpath(" //button[.=' Login ']"));
		//String cssproperty = loginButton.getCssValue("color");
       // System.out.println(cssproperty);
		 String cssproperty = loginButton.getCssValue("font-size");
	        System.out.println(cssproperty);

}
}