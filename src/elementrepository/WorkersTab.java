package elementrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WorkersTab {
WebDriver driver;
public WorkersTab(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);//intialize webElements
}
@FindBy(xpath="//a[@href='/payrollapp/worker/index']")
WebElement workerstab;

@FindBy(xpath="//button[@class='btn btn-primary']")
WebElement searchbutton;
@FindBy(id="workersearch-ni_number")
WebElement ninumber;

WebElement viewbutton;
@FindBy(id="workersearch-ni_number")
WebElement name;

public void getSearchtab()
{
	workerstab.click();
}
public void getNiNumber(String number)
{
	ninumber.sendKeys(number);
}
public void editButton()
{
	viewbutton.click();
}
public void changeName(String changename)
{
	name.sendKeys(changename);
	}
public void groupedFunctions()
{
	getSearchtab();
	getNiNumber("695581");
	editButton();
	changeName("Chithra");
	
}
}

