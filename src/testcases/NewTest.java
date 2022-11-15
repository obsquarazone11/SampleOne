package testcases;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import elementrepository.WorkersTab;
@Test
public class NewTest {
	WebDriver driver;
	public void performFunctions()
	{
		WorkersTab w=new WorkersTab(driver);
		w.groupedFunctions();
	}
 @BeforeMethod()
 
 public void getBrowser() throws InterruptedException
 {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\CHITHRA\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		
     driver = new ChromeDriver();
    
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     driver.get("https://www.qabible.in/payrollapp/site/index");
     WebElement username=driver.findElement(By.id("loginform-username"));
	 username.sendKeys("carol");
WebElement password = driver.findElement(By.id("loginform-password"));
password.sendKeys("1q2w3e4r"); 
Thread.sleep(3000);
WebElement submit=driver.findElement(By.xpath("//button[@type='submit']"));
submit.click(); 
     
     driver.manage().window().maximize();
}
 @AfterMethod()
 public void aftermethod() {
    // driver.close();
 }
 
}
