package synchronization;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FluentWait123 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CHITHRA\\eclipse-workspace\\GroceryStore\\src\\main\\resources\\driverfiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("div[id='start'] button")).click();
		
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)//fluet declartion part
		        .withTimeout(Duration.ofSeconds(30))
		      .pollingEvery(Duration.ofSeconds(5))
		       .ignoring(NoSuchElementException.class);//upto this
		
		//implementation part//usage of fluent wait
		WebElement foo = fluentWait.until(new Function<WebDriver, WebElement>() {

		public WebElement apply(WebDriver driver) {
	    	
		   if(driver.findElement(By.cssSelector("[id='finish'] h4")).isDisplayed())
		    {
		    	 return driver.findElement(By.cssSelector("[id='finish'] h4")); 
		    } 
		    else
		    	return null;
		    
		    }
		  });

		System.out.print(driver.findElement(By.xpath("//*[@id=\"finish\"]/h4")).getText());


		}}

		

		

	