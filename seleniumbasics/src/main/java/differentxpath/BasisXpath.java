package differentxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasisXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ammua\\Documents\\localdriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		//driver.get("https://www.amazon.in/");
		//driver.manage().window().maximize();
		
		//syntax
		
		//tagName[@attribute='attribute value']
		//WebElement searchFeild=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		driver.get("https://www.facebook.com/");
		  driver.manage().window().maximize(); 
		  WebElement searchFeild=driver.findElement(By.xpath("//input[@id='email']"));
		  searchFeild.click();
		  searchFeild.sendKeys("aiswarya");
		
	}

}
