package testengine;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class BasicTest {
	

  @Test(groups="Critical")
  public void testCase1() {
	  System.out.println("testCase1");
  }
  @Test(enabled=false)

  public void atestCase2() {
	  System.out.println("testCase2");
	  
  }
  
		 
  @Test
  public void testCase3() {
	  System.out.println("testCase3");
  }
  @DataProvider (name = "data-provider")
	public Object[][] dpMethod(){
		return new Object[][] {{2, 3,5}, {5, 7,8},{10,15,5},{20,22,44}};
	}

}
