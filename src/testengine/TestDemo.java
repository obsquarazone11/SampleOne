package testengine;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestDemo {
  WebDriver driver;
  @Test
  public void validateText()
  {
	  
	 WebElement loginbutton=driver.findElement(By.id("w3loginbtn"));
	 		//String login=loginbutton.getText();
	 		//System.out.println(login);
	 		String actual="Log in";
	 		String expected=loginbutton.getText();
	 		Assert.assertEquals(actual, expected,"Text is not as per the requirement");
	 	
  }
  @Test
  public void getCssValue()
  {
	  WebElement logbutton=driver.findElement(By.id("w3loginbtn"));
	  //String login=logbutton.getCssValue("background-color");
		//System.out.println(login);
	  String actual="rgba(4, 170, 109, 1)";
	  String expected=logbutton.getCssValue("background-color");
	  Assert.assertEquals(actual, expected,"Background color is not as per the requirement");

  }
  @Test
  public void getCssValue_color()
  {
	  WebElement logbutton=driver.findElement(By.id("w3loginbtn"));
	  //String login=logbutton.getCssValue("background-color");
		//System.out.println(login);
	  String actual="black";
	  String expected=logbutton.getCssValue("color");
	  Assert.assertEquals(actual, expected,"Text color is not as per the requirement");

  }
  @BeforeMethod
  @Parameters("Browser")
  public void beforemethod(String browser) throws InterruptedException {
  	if (browser.equals("chrome")) {

  	System.setProperty("webdriver.chrome.driver","C:\\Users\\CHITHRA\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		
          driver = new ChromeDriver();}
  	else if(browser.equals("edge"))
  	{
  		System.setProperty("webdriver.edge.driver","C:\\Users\\CHITHRA\\Desktop\\selenium\\edgedriver_win64\\msedgedriver.exe");

  		
  		WebDriver driver = new EdgeDriver();
  	}
  	Thread.sleep(5000); 
      driver.get("https://www.w3schools.com/java/default.asp\n");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

  @AfterMethod
  public void aftermethod() {
      driver.close();
  }
  
  
}
