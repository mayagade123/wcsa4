package scenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Scenario4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.ebay.com/");
		
		driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("Apple watches");
	 WebElement DropdownElement = driver.findElement(By.xpath("//select[@name='_sacat']"));
		
		Select sel = new Select(DropdownElement);
		sel.selectByIndex(21);
		driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
		String name = driver.findElement(By.xpath("//span[.='Nylon Band Trail Loop For Apple Watch Ultra 38-49mm iWatch Series 8 7 6 SE 5 4']")).getText();
		System.out.println(name+": is the name of Nylone band");
		Thread.sleep(2000);
		String price = driver.findElement(By.xpath("(//span[@class='s-item__price'])[1]")).getText();
		System.out.println(price+":is the price of Nylone Band");
		
}
}