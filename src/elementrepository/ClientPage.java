package elementrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClientPage {
WebDriver driver;
public ClientPage(WebDriver driver)
{
	this.driver = driver;
	

	
}
By clienttab=By.xpath("//a[@href='/payrollapp/client/index']");
By clientsearchid=By.id("clientsearch-id");
By  search=By.xpath("//button[@class='btn btn-primary']");

public void getClientTab() throws InterruptedException
{
	driver.findElement(clienttab).click();
	Thread.sleep(3000);
}
public void sendClientId(String id) throws InterruptedException
{
	driver.findElement(clientsearchid).sendKeys(id);
	Thread.sleep(3000);
}
public void clickSearchbutton() throws InterruptedException
{
	driver.findElement(search).click();
	Thread.sleep(3000);
}
}