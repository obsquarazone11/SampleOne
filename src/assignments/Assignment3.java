package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\CHITHRA\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		WebElement dd1 = driver.findElement(By.xpath("//li[@class='block15 ui-draggable']//a"));
		WebElement dd2 = driver.findElement(By.xpath("//ol[@class='field15 ui-droppable ui-sortable']//li"));
		a.dragAndDrop(dd1, dd2).perform();
	}

}
