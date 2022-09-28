package selenium_Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	public static void main(String args[]) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\CHITHRA\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	 driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
	 WebElement checkbx1=driver.findElement(By.id("check-box-one"));
	 boolean a=checkbx1.isSelected();
	 System.out.println("Status of checkbox 1 before selection  "+a);
	 checkbx1.click();
		boolean b=checkbx1.isSelected();
		System.out.println("Status of checkbox 1 after selection   "+b);
		WebElement checkbx2=driver.findElement(By.id("check-box-two"));
		 boolean c=checkbx2.isSelected();
		 System.out.println("Status of checkbox 2 before selection   "+c);
		 checkbx2.click();
			boolean d=checkbx2.isSelected();
			System.out.println("status of checkbox 2 after selection   "+d);
		WebElement selectall=driver.findElement(By.id("button-two"));
		String s=selectall.getCssValue("background-color");
		System.out.println("Background Color   "+s);
		String r=selectall.getCssValue("color");
		System.out.println("Font color     "+r);
		 String selectalltag = selectall.getTagName();
		 System.out.println("Tagname of Select all button    "+selectalltag);
		 String selectallatt =selectall.getAttribute("value");
		 System.out.println("Value of value attribute    "+selectallatt);
		 driver.findElement(By.xpath("//a[@href='radio-button-demo.php']")).click();
         WebElement radio1 = driver.findElement(By.id("inlineRadio1"));
         radio1.click();
         boolean b3 = radio1.isSelected();
         System.out.println("Status of radio button after selection   "+b3);

		
}
}