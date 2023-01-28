package testNGpackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Class1 {
  @Test
  public void today() {
	  Reporter.log("i am today method",true);
  }
  
  @Test
  public void tomorrow() {
	  Reporter.log("i am tomorrow method",true);
  }
}
