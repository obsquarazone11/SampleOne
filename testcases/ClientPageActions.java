package testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import elementrepository.ClientPageActionDemo;

public class ClientPageActions {
	WebDriver driver;
	public void clientActions()
	{
		ClientPageActionDemo obj=new ClientPageActionDemo(driver);
		obj.clientPageActions();
	}
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
	   driver.close();
	}
}
