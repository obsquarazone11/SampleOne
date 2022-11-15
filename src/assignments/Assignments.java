package assignments;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.JavascriptExecutor;
public class Assignments {
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\CHITHRA\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/reservation.php");
		driver.manage().window().maximize();
		// driver.findElement(By.xpath("//a[@href='reservation.php']")).click();
		// driver.switchTo().alert().dismiss();
		WebElement dd1 = driver.findElement(By.xpath("//select[@name='passCount']"));
		dd1.click();
		Select s = new Select(dd1);
		s.selectByValue("4");
		WebElement pno = s.getFirstSelectedOption();
		String pnum = pno.getText();
		System.out.println("No of passengers Selected    " + pnum);
		Thread.sleep(2000);
		WebElement dd2 = driver.findElement(By.xpath("//select[@name=\"fromPort\"]"));
		dd2.click();
		Select s1 = new Select(dd2);
		s1.selectByVisibleText("London");
		/*
		 * JavascriptExecutor j=(JavaScriptExecutor)driver;
		 * j.executeScript("Window.scrollBy, (0,300)");
		 */
		WebElement place = s1.getFirstSelectedOption();
		String pname = place.getText();
		System.out.println("Destination place selected    " + pname);
		WebElement dd3 = driver.findElement(By.xpath("//select[@name='airline']"));
		Thread.sleep(2000);

		Select s2 = new Select(dd3);
		s2.selectByVisibleText("Blue Skies Airlines");
		WebElement type = s2.getFirstSelectedOption();
		String typename = type.getText();
		System.out.println("Airline preference selected     " + typename);
		Thread.sleep(3000);
		WebElement b = driver.findElement(By.xpath("//input[@type='image']"));
		b.click();
	}
}