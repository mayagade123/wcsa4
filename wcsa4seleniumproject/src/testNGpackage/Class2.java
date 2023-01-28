package testNGpackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class2 {
  @Test
  public void test1() {
	  Reporter.log("i am test1 method",true);
  }
  
  @Test
  public void test2() {
	  Reporter.log("i am test2 method",true);
  }
}
