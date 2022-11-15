package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\CHITHRA\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.qabible.in/payrollapp/site/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("loginform-username")).sendKeys("carol");
		driver.findElement(By.id("loginform-password")).sendKeys("1q2w3e4r");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);

		WebElement wpage = driver.findElement(By.xpath("//a[@href='/payrollapp/worker/index']"));
		wpage.click();
		WebElement search = driver.findElement(By.xpath("//button[@type='submit']"));
		String s = search.getText();
		System.out.println("Text of Search button :  " + s);

		WebElement reset = driver.findElement(By.xpath("//button[@type='reset']"));
		String s1 = reset.getText();
		System.out.println("Text of Reset button  :  " + s1);
		WebElement cpage = driver.findElement(By.xpath("//a[@href='/payrollapp/client/index']"));
		cpage.click();
		WebElement re = driver.findElement(By.xpath("//button[@type='submit']"));
		String s2 = re.getCssValue("background-color");

		System.out.println("Background Color of Reset button :  " + s2);
		WebElement dd = driver.findElement(By.xpath("//a[@href='/payrollapp/deduction/index']"));
		dd.click();
		WebElement ee = driver.findElement(By.xpath("//a[@href='/payrollapp/deduction/view?id=5720']"));
		String title = ee.getAttribute("title");
		System.out.println("ToolTip of eye-icon in the page:   " + title);
	}
}
