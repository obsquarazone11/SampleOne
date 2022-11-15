package elementrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

WebDriver driver;
	
	public LoginPage(WebDriver driver)//driver arguement is to create relation b/w accessing class
	{
		this.driver = driver;
		

		
	}
	By username=By.id("loginform-username");
	By password=By.id("loginform-password");
	By loginbutton=By.xpath("//button[@type='submit']");


public void getUsername(String name)
{
driver.findElement(username).sendKeys(name);

}
public void getpassword(String pswd) {
	driver.findElement(password).sendKeys(pswd);//"1q2w3e4r"

}

public void clickloginButton() {

	driver.findElement(loginbutton).click();
}
public void performLogin()
{
	getUsername("carol");
	getpassword("1q2w3e4r");
	clickloginButton() ;

}
}


