package testengine;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.Parameters;

public class Assignment66 {

	WebDriver driver;

	
	@BeforeMethod(alwaysRun=true)
	public void logifunction() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CHITHRA\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.qabible.in/payrollapp/site/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("loginform-username")).sendKeys("carol");
		driver.findElement(By.id("loginform-password")).sendKeys("1q2w3e4r");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
	}

	@Test
	public void aworkersPage() {
		WebElement wpage = driver.findElement(By.xpath("//a[@href='/payrollapp/worker/index']"));
		wpage.click();
		WebElement search = driver.findElement(By.xpath("//button[@type='submit']"));
		String actual = search.getText();
		String expected = "SEARCH";
		SoftAssert s=new SoftAssert();
		s.assertEquals(actual, expected, "Text is not matching");
		WebElement reset = driver.findElement(By.xpath("//button[@type='reset']"));
		String actualtext = reset.getText();
		String expectedtext = "RESET";
		Assert.assertEquals(actualtext, expectedtext, "Text is not matching");

	}

	/*
	 * @Test public void clientPage() { WebElement cpage =
	 * driver.findElement(By.xpath("//a[@href='/payrollapp/client/index']"));
	 * cpage.click(); WebElement re =
	 * driver.findElement(By.xpath("//button[@type='submit']")); String actual =
	 * re.getCssValue("background-color"); String expected =
	 * "rgba(51, 122, 183, 1)"; Assert.assertEquals(actual, expected,
	 * "Color is not matching"); }
	 * 
	 * @Test public void ddpage() { WebElement dd =
	 * driver.findElement(By.xpath("//a[@href='/payrollapp/deduction/index']"));
	 * dd.click(); WebElement ee =
	 * driver.findElement(By.xpath("//a[@href='/payrollapp/deduction/view?id=5720']"
	 * )); String title = ee.getAttribute("title");
	 * System.out.println("ToolTip of eye-icon in the page is   " + title); }
	 */
	
	  @AfterMethod(alwaysRun = true) public void aftermethod() { driver.close(); }
	  


}
