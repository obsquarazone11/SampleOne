package testengine;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.Parameters;


import org.testng.Assert;


public class BasicAssertion {
	WebDriver driver;
	
	/*
	 * @Test public void remembermeCheckBoxValidation() {
	 * 
	 * WebElement checkbox =
	 * driver.findElement(By.xpath("//input[@id='loginform-rememberme']"));
	 * checkbox.click(); boolean expected = true;
	 *  boolean actual =checkbox.isSelected(); 
	 * Assert.assertEquals(actual, expected,
	 * " :The rememeberme checkbox is selected"); }
	 * 
	 * @Test public void loginButtonTextValidation() 
	 * { WebElement
	 * loginButton=driver.findElement(By.xpath("//button[@type='submit']")); 
	 * String actual=loginButton.getText(); 
	 * String expected="LOGINO"; 
	 * SoftAssert soft = new SoftAssert(); 
	 * soft.assertEquals(actual, expected," :Login button text not expected "); soft.assertAll();
	 * 
	 * }
	 */
	
	/**/
    @BeforeMethod
    
    public void beforemethod() {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\CHITHRA\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		
            driver = new ChromeDriver();
    
        driver.get("https://www.qabible.in/payrollapp/site/login\n");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void aftermethod() {
        driver.close();
    }
    @Test
  	@Parameters({"para1","para2","para3","para4"})
  	public void parameterTesting(int a, int  b, int c,String d) {
  		System.out.println(a);
  		System.out.println(b);
  		System.out.println(c);
  		System.out.println(d);
  		//System.out.println("Testcase 1 executed");

  	}

}
