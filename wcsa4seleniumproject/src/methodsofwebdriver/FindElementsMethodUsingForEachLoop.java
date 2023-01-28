package methodsofwebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethodUsingForEachLoop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.switchTo().activeElement().sendKeys("poha");
		Thread.sleep(2000);
		List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		
		for(WebElement suggest:suggestions)
		{
			String opt = suggest.getText();
			Thread.sleep(6000);
			System.out.println(opt);
		}
	}
}
