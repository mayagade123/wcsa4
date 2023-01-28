package pageObjectModel;

import java.io.IOException;

public class ActiTimeInvalidLogin extends BaseTest{
public static void main(String[] args) throws IOException, InterruptedException {
	BaseTest bt = new BaseTest();
	bt.openBrowser();
	Flib flib = new Flib();
	
	LoginPage lp = new LoginPage(driver);
	int rc = flib.rowCount(EXCEL_PATH, "invalidcreds");
	for(int i=1;i<=rc;i++)
	{
	  String invalidUsename = flib.readExcelData(EXCEL_PATH, "invalidcreds", i,0);
	  String invalidPassword = flib.readExcelData(EXCEL_PATH, "invalidcreds", i,1);
	  lp.actiTimeInvalidLogin(invalidUsename, invalidPassword);
	}
	bt.closeBrowser();
}
}
// FINAL TEST CASE