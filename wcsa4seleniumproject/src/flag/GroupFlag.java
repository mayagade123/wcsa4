package flag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupFlag {
  @Test(groups="FUNCTIONAL TESTING")
  public void ft1() {
	  Reporter.log("FUNCTIONAL TESTING1",true);
  }
  
  @Test(groups="FUNCTIONAL TESTING")
  public void ft2() {
	  Reporter.log("FUNCTIONAL TESTING2",true);
  }
  
  @Test(groups="FUNCTIONAL TESTING")
  public void ft3() {
	  Reporter.log("FUNCTIONAL TESTING3",true);
  }
  
  @Test(groups="FUNCTIONAL TESTING")
  public void ft4() {
	  Reporter.log("FUNCTIONAL TESTING4",true);
  }
  
  @Test(groups="FUNCTIONAL TESTING")
  public void ft5() {
	  Reporter.log("FUNCTIONAL TESTING5",true);
  }
  
  @Test(groups="FUNCTIONAL TESTING")
  public void ft6() {
	  Reporter.log("FUNCTIONAL TESTING6",true);
  }
  //---------------------------------------------------------
  
  @Test(groups="INTEGRATION TESTING")
  public void it1() {
	  Reporter.log("INTEGRATION TESTING1",true);
  }
  
  @Test(groups="INTEGRATION TESTING")
  public void it2() {
	  Reporter.log("INTEGRATION TESTING2",true);
  }
  
  @Test(groups="INTEGRATION TESTING")
  public void it3() {
	  Reporter.log("INTEGRATION TESTING3",true);
  }
  
  @Test(groups="INTEGRATION TESTING")
  public void it4() {
	  Reporter.log("INTEGRATION TESTING4",true);
  }
  
  @Test(groups="INTEGRATION TESTING")
  public void it5() {
	  Reporter.log("INTEGRATION TESTING5",true);
  }
  @Test(groups="INTEGRATION TESTING")
  public void it6() {
	  Reporter.log("INTEGRATION TESTING6",true);
  }
  //----------------------------------------------------------
  @Test(groups="SYSTEM TESTING")
  public void st1() {
	  Reporter.log("SYSTEM TESTING1",true);
  }
  
  @Test(groups="SYSTEM TESTING")
  public void st2() {
	  Reporter.log("SYSTEM TESTING2",true);
  }
  
  @Test(groups="SYSTEM TESTING")
  public void st3() {
	  Reporter.log("SYSTEM TESTING3",true);
  }
  
  @Test(groups="SYSTEM TESTING")
  public void st4() {
	  Reporter.log("SYSTEM TESTING4",true);
  }
  
  @Test(groups="SYSTEM TESTING")
  public void st5() {
	  Reporter.log("SYSTEM TESTING5",true);
  }
  
  @Test(groups="SYSTEM TESTING")
  public void st6() {
	  Reporter.log("SYSTEM TESTING6",true);
  }
}
