package p1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestA {
  @Test
  public void f() {
	  Reporter.log("f executed", true);
  }
  @Test
  public void g()
  {
	  Reporter.log("g executed", true);
  }
  
}
