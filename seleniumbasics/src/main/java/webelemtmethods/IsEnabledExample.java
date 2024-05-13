package webelemtmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//isEnabled  - check the button is enabled or not
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ammua\\Documents\\localdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/enabled");
		  driver.manage().window().maximize(); 
		  WebElement firstbtn =driver.findElement(By.xpath("//input[@id='disabledInput']"));
		  WebElement secondbtn =driver.findElement(By.xpath("//input[@id='input']"));
		  boolean firstbtnstatus=firstbtn.isEnabled();
		  boolean secondbtnstatus=secondbtn.isEnabled();
		  System.out.println(firstbtnstatus);
		  System.out.println(secondbtnstatus);
		  driver.quit();
		//ul[@class='navbar-nav']//li[1]/a
		  //single and double - immediate parent or child single slash
	}

}
