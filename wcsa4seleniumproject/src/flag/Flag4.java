package flag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag4 {
  @Test
  public void LogIN() {
	  Reporter.log("Log IN",true);
  }
  
  @Test(dependsOnMethods="LogIN")
  public void CreateUser() {
	  Reporter.log("Create User",true);
  }
  
  @Test(dependsOnMethods="CreateUser")
  public void LogOut() {
	  Reporter.log("Log Out",true);
  }
  
  
  
}
