package assignmentofactitime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateNewTask {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.get("http://desktop-dli52n7/tasks/otasklist.do");
		 Thread.sleep(2000);
		 driver.findElement(By.name("username")).sendKeys("admin");
		 Thread.sleep(2000);
		 driver.findElement(By.name("pwd")).sendKeys("manager");
		 Thread.sleep(2000);
		 driver.findElement(By.id("loginButton")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.cssSelector("input[value='Create New Tasks']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.cssSelector("select[name='customerId']")).click();
		 Thread.sleep(4000);
		 driver.findElement(By.cssSelector("input[name='task[0].markedToBeAddedToUserTasks']")).click();
		 Thread.sleep(4000);
		 driver.findElement(By.cssSelector("input[name='afterCreateAction']")).click();
}
}
