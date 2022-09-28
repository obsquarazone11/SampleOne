package selenium_Projects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\CHITHRA\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/table-pagination.php\r\n");
		driver.manage().window().maximize();

		/*
		 * List <WebElement>tablerow2=driver.findElements(By.xpath(
		 * "//table[@id='dtBasicExample']//tbody//tr[2]//td")); for(int
		 * i=0;i<tablerow2.size();i++) { System.out.println(tablerow2.get(i).getText());
		 * }
		 */
		List<WebElement> tablecolumn4 = driver
				.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[4]"));
		for (int j = 0; j < tablecolumn4.size(); j++) {
			System.out.println(tablecolumn4.get(j).getText());
		}
	}
}
