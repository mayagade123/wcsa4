package methodsofwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementMethod {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-dli52n7/login.do");
		
		
		WebElement usernameTextBox = driver.findElement(By.name("username"));
		usernameTextBox .sendKeys("admin");
		System.out.println(usernameTextBox );
	      
	}
}
