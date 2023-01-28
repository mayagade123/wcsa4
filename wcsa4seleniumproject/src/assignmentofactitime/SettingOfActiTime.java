package assignmentofactitime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SettingOfActiTime {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 Thread.sleep(1000);
		 driver.get("http://desktop-dli52n7/administration/administration.do");
		 Thread.sleep(1000);
		 driver.findElement(By.name("username")).sendKeys("admin");
		 Thread.sleep(1000);
		 driver.findElement(By.name("pwd")).sendKeys("manager");
		 Thread.sleep(1000);
		 driver.findElement(By.id("loginButton")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.cssSelector("select[name='firstHierarchyLevelCode']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.cssSelector("select[name='secondHierarchyLevelCode']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.cssSelector("select[name='thirdHierarchyLevelCode']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.cssSelector("input[name='maximumMinutesPerDayStr']")).sendKeys("23:00");
		 Thread.sleep(1000);
		 driver.findElement(By.cssSelector("input[name='restrictTT']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.cssSelector("input[name='workdayDurationStr']")).sendKeys("9:00");
		 Thread.sleep(1000);
		 driver.findElement(By.cssSelector("input[name='enableCsvMultilanguage']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.cssSelector("select[name='weekStartDay']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.cssSelector("select[name='dateFormat']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.cssSelector("select[name='defaultTimeZone']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.cssSelector("select[name='decimalSeparator.predefined']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.cssSelector("select[name='digitGroupingSymbol.predefined']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.cssSelector("input[id='saveSettingsButton']")).click();
		 Thread.sleep(1000);

}
}
