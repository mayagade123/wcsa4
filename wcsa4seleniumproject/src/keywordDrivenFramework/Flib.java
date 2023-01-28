package keywordDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.chainsaw.Main;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	//read excel data
	public String readExcelData(String excelPath, String SheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(SheetName);
		Row row = sheet.getRow(rowCount);
		Cell cell = row.getCell(cellCount);
		String data = cell.getStringCellValue();
		return data;
	}
	// to get Last RowCount
	public int rowCount(String excelpath, String SheetName) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(SheetName);
	    int rc = sheet.getLastRowNum();
		return rc;
		} 
	
	// to write excel data
	public void writeExcelData(String excelpath, String sheetName, int rowCount, int cellCount, String data) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(rowCount);
		//---------------------------------------------------------------------
		Cell cell = row.createCell(cellCount);
		cell.setCellValue(data);
		
		FileOutputStream fos = new FileOutputStream(excelpath);
		wb.write(fos);
	}
	
	// to read property data
	public String readPropertyData(String excelPath, String keyvalue) throws IOException {
		FileInputStream fis = new FileInputStream(excelPath);
		Properties prop = new Properties();
		prop.load(fis);
		String data = prop.getProperty(keyvalue);
        return data;
	}
	
}
