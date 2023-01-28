package annotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	 @BeforeTest
	  public void beforeTest() {
		  Reporter.log("beforeTest",true);
	  }
  @BeforeSuite
  public void beforeSuite() {
	  Reporter.log("beforeSuite",true);
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("beforeMethod",true);
  }
  @AfterTest
  public void afterTest() {
	  Reporter.log("AfterTest",true);
  }
  @Test
  public void test() {
	  Reporter.log("@Test",true);
  }
  @AfterMethod
  public void afterMethod() {
	  Reporter.log("AfterMethod",true); 
  }
 
  @AfterClass
  public void afterClass(){
	  Reporter.log("AfterClass",true);
  }
  @AfterSuite
  public void afterSuite() {
	  Reporter.log("AfterSuite",true);
  }
  @BeforeClass
  public void beforClass(){
	  Reporter.log("beforeClass",true);
  }

}
