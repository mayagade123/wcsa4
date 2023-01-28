package seleniummock1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PriceOfLaptop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Hp laptop");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Core i7']/preceding-sibling:: div[@class='_24_Dny']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[.='Brand' and @class='_2gmUFU _3V8rao']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[.='HP']/preceding-sibling:: div[@class='_24_Dny']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[.='Operating System' and @class='_2gmUFU _3V8rao']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[.='Windows 10']/preceding-sibling::div [@class='_24_Dny']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[.='4★ & above']/preceding-sibling:: div[@class='_24_Dny']")).click();
		Thread.sleep(4000);
		String priceFirstSuggestion = driver.findElement(By.xpath("//div[.='HP Pavilion Gaming Core i7 11th Gen - (16 GB/512 GB SSD/Windows 10 Home/4 GB Graphics/NVIDIA GeForce R...']/../following-sibling::div[@class='col col-5-12 nlI3QM']//ancestor::div[.='₹1,10,900']")).getText();
		Thread.sleep(8000);
       System.out.println( priceFirstSuggestion + " : Is the price of Firstsuggestion ");
       Thread.sleep(4000);
        driver.quit();
		

}
}