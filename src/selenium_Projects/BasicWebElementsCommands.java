package selenium_Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicWebElementsCommands {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\CHITHRA\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.qabible.in/payrollapp/site/login");
		driver.manage().window().maximize();
		/*
		 * driver.findElement(By.id("loginform-username")).sendKeys("chithra");
		 * WebElement pass=driver.findElement(By.id("loginform-password"));
		 * pass.sendKeys("123");
		 *  WebElement log=driver.findElement(By.xpath("//button[@class='btn btn-default']"));
		 * log.click();
		 */
					
		
	
	 WebElement username=driver.findElement(By.id("loginform-username"));
			 username.sendKeys("jyothi");
	 WebElement password = driver.findElement(By.id("loginform-password"));
	 password.sendKeys("Qburst@12345"); 
	 password.clear();
	 Thread.sleep(3000);
	 password.sendKeys("chithra123");
	 WebElement remember_me=driver.findElement(By.className("class-remember"));
	 remember_me.click();
	Boolean b=remember_me.isSelected();
	System.out.println(b);
	 remember_me.click();
	 Thread.sleep(3000);
	 Boolean c=remember_me.isSelected();
	 System.out.println(c);
	 
	 
		/*
		 * String password1 = password.getTagName(); System.out.println(password1);
		 * String attribute = password.getAttribute("type");
		 * System.out.println(attribute);
		 * 
		 * 
		 * WebElement submit=driver.findElement(By.xpath("//button[@type='submit']"));
		 * submit.click(); String logincolor = submit.getCssValue("background-color");
		 * System.out.println(logincolor); 
		 * 
		 * String fontsize = submit.getCssValue("font-size"); System.out.println(fontsize);
		 * 
		 */
	}
}