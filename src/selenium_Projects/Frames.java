package selenium_Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
			System.setProperty("webdriver.chrome.driver","C:\\Users\\CHITHRA\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			 driver.get("https://demoqa.com/frames");
			 driver.manage().window().maximize();
			 driver.manage().window().maximize();
				driver.switchTo().frame("frame1");//Tracked using id
				
				//https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html
				//WebElement childFrame=driver.findElement(By.xpath("//iframe[@id='frame1']"));// by
				// iframe
			 
				//driver.switchTo().frame(childFrame);
				
				String k = driver.findElement(By.id("sampleHeading")).getText();
				//driver.switchTo().parentFrame();
				//driver.switchTo().defaultContent();
				Thread.sleep(3000);
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("window.scrollBy(0,550)");
				System.out.println(k);

			}

		}

			 		
	



