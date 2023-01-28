package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathOnSamsungMobile {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(4000);
		driver.findElement(By.name("q")).sendKeys("Samsung mobiles");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[.='SAMSUNG Galaxy F13 (Sunrise Copper, 64 GB)']")).click();
		Thread.sleep(4000);
		String priceOfMobile = driver.findElement(By.xpath("//span[.='SAMSUNG Galaxy F13 (Sunrise Copper, 64 GB)']/../following-sibling::span[@class='yhB1nd GXgmTe']//ancestor::[@class='_25b18c']")).getText();
		Thread.sleep(4000);
		System.out.println(priceOfMobile +": is the price of mobile");
		
}
}
