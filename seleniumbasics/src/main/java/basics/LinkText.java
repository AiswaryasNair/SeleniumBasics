package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ammua\\Documents\\localdriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();//run time polymorphism
		//driver.get("https://Facebook.com");
		//WebElement linktext=driver.findElement(By.linkText("Forgotten password?"));
		//WebElement linktext=driver.findElement(By.partialLinkText("Forgotten"));
		//linktext.click();
		
		/*
		 * driver.get("https://www.instagram.com/");
		 * driver.manage().window().maximize(); WebElement
		 * linktext=driver.findElement(By.linkText("Forgot password?")); //WebElement
		 * linktext=driver.findElement(By.partialLinkText("password?"));
		 * linktext.click();
		 */
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement linktext=driver.findElement(By.linkText("See all offers"));
		//WebElement linktext=driver.findElement(By.partialLinkText("password?"));
		linktext.click();
	}

}
