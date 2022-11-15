package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import elementrepository.ClientPage;
import elementrepository.LoginPage;
import elementrepository.LoginPageFactory;

public class LoginTeseCae {
	
	    WebDriver driver;
	    //@Test
		/*
		 * public void loginFnVerification() { LoginPageFactory l=new
		 * LoginPageFactory(driver); l.getUsername("carol"); l.getpassword("1q2w3e4r");
		 * l.clickloginButton(); }
		 */

		
		  @Test public void loginFnVerification() {
		  
		 LoginPageFactory lp=new LoginPageFactory(driver); lp.performLogin();
		  String actual=driver.findElement(By.cssSelector("a.dropdown-toggle")).getText();
		 String expected="CAROL THOMAS123"; Assert.assertEquals(actual,
		  expected,"Profile name is not as per the requirement");
		  
		  }
		
		/*
		 * @Test public void clientsearch() throws InterruptedException {
		 * 
		 * LoginPage lp=new LoginPage(driver); lp.performLogin(); 
		 * ClientPage cp=new ClientPage(driver); cp.getClientTab(); cp.sendClientId("1");
		 * cp.clickSearchbutton();
		 * 
		 * }
		 */

	    @BeforeMethod(alwaysRun = true)
	    @Parameters("Browser")
	    public void beforeMethod(String browser) throws InterruptedException {
	        if (browser.equals("chrome")) {

	        	System.setProperty("webdriver.chrome.driver","C:\\Users\\CHITHRA\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
	            driver = new ChromeDriver();
	        } else if (browser.equals("edge")) {
	        	System.setProperty("webdriver.edge.driver","C:\\Users\\CHITHRA\\Desktop\\selenium\\edgedriver_win64\\msedgedriver.exe");

	            driver = new EdgeDriver();
	        }
	        Thread.sleep(5000);
	        driver.get("https://www.qabible.in/payrollapp/site/login");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    }

	    @AfterMethod(alwaysRun = true)
	    public void aftermethod() {
	       // driver.close();
	    }
	}

