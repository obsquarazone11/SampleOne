package selenium_Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardMouseActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\CHITHRA\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
driver.get("https://demoqa.com/buttons");
Actions actions=new Actions(driver);

 WebElement double_click=driver.findElement(By.id("doubleClickBtn"));
	/*
	 * actions.doubleClick(double_click).perform(); WebElement
	 * right_click=driver.findElement(By.id("rightClickBtn"));
	 * actions.contextClick(right_click).perform();
	 */ 
actions.contextClick().perform();//just right click any where in the webpage
actions.sendKeys(Keys.ARROW_DOWN).perform();
actions.moveToElement(double_click).perform();//mouse over



	}

}
