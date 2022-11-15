package testengine;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.Parameters;


import org.testng.Assert;


public class BasicAssertion2usingbrowser {
	WebDriver driver;
	
	  @Test public void remembermeCheckBoxValidation() {
	  
	  WebElement checkbox = driver.findElement(By.xpath("//input[@id='loginform-rememberme']"));
	  checkbox.click(); 
	  boolean expected = true;
	  boolean actual =checkbox.isSelected();
	  Assert.assertEquals(actual, expected, " :The rememeberme checkbox is selected");
	  }
	 
	  @Test public void loginButtonTextValidation()
	  {
		  WebElement loginButton=driver.findElement(By.xpath("//button[@type='submit']"));
		  String actual=loginButton.getText();
		  String expected="LOGINO"; 
		  SoftAssert soft = new SoftAssert(); 
		  soft.assertEquals(actual, expected, " :Login button text not expected "); soft.assertAll();
	 
	  }
	
	
	@Test(groups= {"Critical"})

	public void loginButtonBgColorValidation()
	{
		WebElement loginButton=driver.findElement(By.xpath("//button[@type='submit']"));
		
		String actual=loginButton.getCssValue("background-color");
		System.out.println(actual);
		String expected="rgba(6, 173, 243, 1)";

		
		 SoftAssert soft = new SoftAssert(); 
		 soft.assertEquals(actual, expected, " :Login Button color is not as expected "); 
		 soft.assertAll();
		 
	}
    @BeforeMethod(alwaysRun=true)
    @Parameters("Browser")
    public void beforemethod(String browser) throws InterruptedException {
    	if (browser.equals("chrome")) 
    	{

    	System.setProperty("webdriver.chrome.driver","C:\\Users\\CHITHRA\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		
            driver = new ChromeDriver();
            }
    	else if(browser.equals("edge"))
    	{
    		System.setProperty("webdriver.edge.driver","C:\\Users\\CHITHRA\\Desktop\\selenium\\edgedriver_win64\\msedgedriver.exe");

    		
    		WebDriver driver = new EdgeDriver();
    	}
    	Thread.sleep(5000); 
        driver.get("https://www.qabible.in/payrollapp/site/login\n");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod(alwaysRun=true)
    public void aftermethod() {
        driver.close();
    }
    /*@Test
  	@Parameters({"para1","para2","para3","para4"})
  	public void parameterTesting(int a, int  b, int c,String d) {
  		System.out.println(a);
  		System.out.println(b);
  		System.out.println(c);
  		System.out.println(d);
  		//System.out.println("Testcase 1 eexecuted");
  		 * }
*/
  	

}
