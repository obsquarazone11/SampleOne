package selenium_Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
	public static void main(String args[]) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\CHITHRA\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	 driver.get("https://www.qabible.in/payrollapp/site/login");
	 driver.manage().window().maximize();
	 driver.findElement(By.id("loginform-username")).sendKeys("carol");
	 driver.findElement(By.id("loginform-password")).sendKeys("1q2w3e4r");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(3000);
	WebElement click1=driver.findElement(By.xpath("//a[@href='/payrollapp/timesheet/index']"));
	click1.click();
	
	
	
		 
}}
