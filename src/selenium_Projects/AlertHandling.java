package selenium_Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CHITHRA\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/javascript-alert.php\r\n");
		driver.manage().window().maximize();
		
          WebElement clickme_btn =driver.findElement(By.xpath("//button[@class='btn btn-success']"));
         clickme_btn.click();
         String text = driver.switchTo().alert().getText();
         driver.switchTo().alert().accept();//accepting alert box
          //driver.switchTo().alert().dismiss(); //dismissing alert box
          System.out.println("The text inside the pop up is: " + text);
          Thread.sleep(2000);
          
          WebElement clickme_btn2 =driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
          clickme_btn2.click();
          String text2 = driver.switchTo().alert().getText();
         // driver.switchTo().alert().accept();//accepting alert box
           driver.switchTo().alert().dismiss(); //dismissing alert box
           System.out.println("The text inside the pop up is: " + text2);
          
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,300)");
          WebElement click_prompt_box=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
          click_prompt_box.click();
          Thread.sleep(4000); 
          driver.switchTo().alert().sendKeys("jyothi");
         

        


	}

}
