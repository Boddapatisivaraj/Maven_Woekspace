package p2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestB {
	 @Test
	  public void z() {
		  Reporter.log("z executed", true);
	  }
	  @Test
	  public void i()
	  {
		  Reporter.log("i executed", true);
	  }
	  
}
