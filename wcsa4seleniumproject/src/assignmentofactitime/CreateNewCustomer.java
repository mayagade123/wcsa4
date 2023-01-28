package assignmentofactitime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateNewCustomer {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.get("http://desktop-dli52n7/project/customeradd.do?resetForm=true");
		 Thread.sleep(2000);
		 driver.findElement(By.name("username")).sendKeys("admin");
		 Thread.sleep(2000);
		 driver.findElement(By.name("pwd")).sendKeys("manager");
		 Thread.sleep(2000);
		 driver.findElement(By.id("loginButton")).click();
		 Thread.sleep(4000);
		//driver.findElement(By.cssSelector("input[value='Create New Customer']")).click();
		//Thread.sleep(4000);
		driver.findElement(By.cssSelector("input[name='name']")).sendKeys("Infosys");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='preFillOption']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='createCustomerSubmit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("img[class='sizer']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='DiscardChangesButton']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("select[name='usersSelector.selectedUser']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Create new tasks")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value='Create Tasks']")).click();
}
}
