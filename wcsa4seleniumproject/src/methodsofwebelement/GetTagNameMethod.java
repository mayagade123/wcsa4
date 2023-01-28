package methodsofwebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagNameMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.get("http://desktop-dli52n7/login.do");
		 Thread.sleep(2000);
         WebElement usn = driver.findElement(By.name("username"));
         String TagName = usn.getTagName();
		 System.out.println(TagName);
}
}