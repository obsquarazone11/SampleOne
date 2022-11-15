package selenium_Projects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calender 
{

		   public static void main(String[] args) throws InterruptedException {
		        System.setProperty("webdriver.chrome.driver", "C:\\Users\\CHITHRA\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		         WebDriver driver=new ChromeDriver();
		        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		        driver.manage().window().maximize();
		     
		        String exyear="2023";
	        	String exmonth="July";
	        	String exdate="20";
	        	WebElement datepicker= driver.findElement(By.id("datepicker"));
		        datepicker.click();
		        while(true)
		        {
		        String monthyr=	driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		        String arr[]=monthyr.split(" ");
		        String month=arr[0];
		        String year=arr[1];
		        if(month.equalsIgnoreCase(exmonth) && year.equalsIgnoreCase(year))
		        		break;
		        else
		        driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		        }
		        List<WebElement> alldates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
				for(WebElement ele:alldates)
				{
					String date=ele.getText();
					if(date.equalsIgnoreCase(exdate))
					{
						ele.click();
					}
				}
				
		        /*
				 * Thread.sleep(3000); String month =
				 * driver.findElement(By.cssSelector("span.ui-datepicker-month")).getText();
				 * System.out.println(month);
				 * 
				 * while
				 * (!driver.findElement(By.cssSelector("span.ui-datepicker-month")).getText().
				 * contains("April")) { driver.findElement(By.
				 * xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); }
				 * 
				 * int count = driver.findElements(By.className("ui-state-default")).size(); for
				 * (int i = 0; i < count; i++) { String text =
				 * driver.findElements(By.className("ui-state-default")).get(i).getText(); if
				 * (!text.equalsIgnoreCase("27")) {
				 * driver.findElements(By.className("ui-state-default")).get(i).click(); break;
				 * } }
				 */
			   // WebDriverWait mywait=new WebDriverWait(driver,5);
				WebElement datepicker2= driver.findElement(By.id("datepicker"));
		        datepicker.click();
		        String s=datepicker2.getText();
		        System.out.println(s);
					
		   }
}
		        

		   

		    

		
		
	

