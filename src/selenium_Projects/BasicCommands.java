package selenium_Projects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Users\\CHITHRA\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();


 driver.get("https://www.snapdeal.com"); 
 driver.navigate().to("https://www.amazon.com");
 //driver.get("https://www.amazon.com"); 
 driver.navigate().back();
 driver.navigate().forward();
 
 
 


	}

}
