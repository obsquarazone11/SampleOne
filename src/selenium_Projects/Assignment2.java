package selenium_Projects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment2 {
	public static void main(String args[]) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\CHITHRA\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.qabible.in/payrollapp/site/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("loginform-username")).sendKeys("carol");
		driver.findElement(By.id("loginform-password")).sendKeys("1q2w3e4r");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		WebElement click1 = driver.findElement(By.xpath("//a[@href='/payrollapp/timesheet/index']"));

		click1.click();
		WebElement click2 = driver.findElement(By.xpath("//a[@href='/payrollapp/timesheet/create']"));

		click2.click();
		WebElement browse = driver.findElement(By.id("file-logo"));
		Actions a = new Actions(driver);
		a.moveToElement(browse).click().perform();
		Robot rob = new Robot();
		StringSelection s = new StringSelection("C:\\Users\\CHITHRA\\Desktop\\selenium\\download.jpg");

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		rob.delay(300);
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_V);
		rob.keyRelease(KeyEvent.VK_V);
		rob.keyRelease(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.delay(300);
		rob.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		WebElement upload = driver.findElement(By.xpath("//button[@type='submit']//span[@class='hidden-xs']"));
		// a.moveToElement(upload).click().perform();
		upload.click();
		Thread.sleep(3000);

	}
}
