package assignment;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicateFromDropdown {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.get("file:///C:/Users/nc/Documents/multidropdown.html");
	WebElement dropdownElement = driver.findElement(By.name("menu"));
	Select sel = new Select(dropdownElement);
	List<WebElement> allOptions = sel.getOptions();
	
	 HashSet<String> s = new HashSet<String>();
	 
	 for(int i=0; i<allOptions.size(); i++)
	 {
		 WebElement opts = allOptions.get(i);
		String values = opts.getText();
		s.add(values);
	 }
	 
	 for(String options:s)
	 {
		 System.out.println(options);
	 }
}
}
