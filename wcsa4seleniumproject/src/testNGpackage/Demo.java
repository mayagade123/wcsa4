package testNGpackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	  @Test
	  public void demo() {
		  
		// System.out.println("This is demo method");
		 Reporter.log("This is demo method",true);
	  }
	  
	  @Test
	  public void demo1()
	  {
		  Reporter.log("This is demo1 method",true);
	  }
	  
	  @Test
	  public void demo2()
	  {
		  int a=10;
		  int b=2;
		  int rest=a/b;
		  Reporter.log("This is demo2 method",true);
	  }
	}

