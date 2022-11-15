package selenium_Projects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\CHITHRA\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/select-input.php\\r\\n\r\n");
		driver.manage().window().maximize();
		
		/*
		 * WebElement dropdown_menu =
		 * driver.findElement(By.xpath("//select[@id='single-input-field' ]"));
		 * dropdown_menu.click(); Select s = new Select(dropdown_menu); WebElement
		 * first_element = s.getFirstSelectedOption(); String first_element_value =
		 * first_element.getText(); System.out.println(first_element_value);
		 * s.selectByValue("Red"); WebElement first_element2 =
		 * s.getFirstSelectedOption(); String first_element_value2 =
		 * first_element2.getText(); System.out.println(first_element_value2);
		 * s.selectByIndex(0); WebElement first_element3 = s.getFirstSelectedOption();
		 * String first_element3_value = first_element3.getText();
		 * System.out.println(first_element3_value); s.selectByVisibleText("Green");
		 * WebElement first_element4 = s.getFirstSelectedOption(); String
		 * first_element_value4 = first_element4.getText();
		 * System.out.println(first_element_value4);
		 */
		/*WebElement multiSelect = driver.findElement(By.id("multi-select-field"));
		Select object = new Select(multiSelect);
		object.selectByIndex(1);
		object.selectByIndex(2);

		List<WebElement> values = object.getAllSelectedOptions();
		for (int i = 0; i < values.size(); i++) {
			System.out.println(values.get(i).getText());
*/
		WebElement multiSelect = driver.findElement(By.id("multi-select-field"));
		Select s = new Select(multiSelect);
		List<WebElement> options = s.getOptions();

		for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}

		}
	}

