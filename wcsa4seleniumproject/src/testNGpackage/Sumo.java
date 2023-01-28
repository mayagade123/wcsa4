package testNGpackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sumo {
		  @Test
		  public void sumo() {
			  
			// System.out.println("This is demo method");
			 Reporter.log("This is sumo method",true);
		  }
		  
		  @Test
		  public void sumo1()
		  {
			  Reporter.log("This is sumo1 method",true);
		  }
		  
		  @Test
		  public void sumo2()
		  {
			  Reporter.log("This is sumo2 method",true);
		  }
		}

