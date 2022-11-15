package testengine;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicTestingTest {
	/*
	 * @AfterTest
	 * 
	 * public void afterTest() { System.out.println("AfterTest"); }
	 * 
	 * @BeforeTest public void beforeTest() { System.out.println("beforeTest"); }
	 */
	
	  @BeforeClass public void beforeClass() { System.out.println("beforeClass"); }
	 
	  @AfterClass public void afterClass() { System.out.println("AfterClass"); }

	
	  @BeforeMethod public void beforeMethod() {
	 System.out.println("Before method executed"); }
	  
	 @AfterMethod public void afterMethod() {
	 System.out.println("After method executed"); }
	
	@Test
  public void testCase1() {
	  System.out.println("testCase1");
  }
  @Test

  public void atestCase2() {
	  System.out.println("testCase2");
	  
  }
  @Test
  public void testCase3() {
	  System.out.println("testCase3");
  }
 
  
}
