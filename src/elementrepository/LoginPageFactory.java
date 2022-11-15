package elementrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {
	

		WebDriver driver;
			
			public LoginPageFactory(WebDriver driver)//driver arguement is to create relation b/w accessing class
			{
				this.driver = driver;
				PageFactory.initElements(driver, this);


				
			}
			@FindBy(id = "loginform-username")
			WebElement username;
			@FindBy(id = "loginform-password")
			WebElement password;
			@FindBy(xpath = "//button[@type='submit']")
			WebElement loginbutton;
			
			//By password=By.id("loginform-password");
			//By loginbutton=By.xpath("//button[@type='submit']");


		public void getUsername(String name)
		{
		username.sendKeys(name);

		}
		public void getpassword(String pswd) {
			password.sendKeys(pswd);//"1q2w3e4r"

		}

		public void clickloginButton() {

		loginbutton.click();
		}
		
		  public void performLogin() { getUsername("carol"); getpassword("1q2w3e4r");
		  clickloginButton() ;
		  
		  }
		
		}




