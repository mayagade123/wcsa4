package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class launchfirefoxDriver {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
	}

}

