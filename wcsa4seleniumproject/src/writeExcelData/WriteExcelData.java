package writeExcelData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WriteExcelData {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//WebDriver driver= new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//driver.get("http://desktop-dli52n7/login.do");
		//Thread.sleep(2000);
		FileInputStream fis = new FileInputStream("./data/ActiTimeTestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("validcreds");
		Row row = sheet.getRow(0);
		//--------------------------------------
		Cell cell = row.createCell(2);
		cell.setCellValue("Link");
		FileOutputStream fos = new FileOutputStream("./data/ActiTimeTestData.xlsx");
		wb.write(fos);
}
}
