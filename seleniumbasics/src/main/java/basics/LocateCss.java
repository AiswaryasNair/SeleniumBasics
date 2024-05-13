package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateCss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ammua\\Documents\\localdriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();//run time polymorphism
		//driver.get("https://amazon.in");
		/*
		 * WebElement
		 * searchFeild=driver.findElement(By.cssSelector("#twotabsearchtextbox"));//by using id
		 * searchFeild.click(); searchFeild.sendKeys("Hello");
		 */
		//driver.get("https://www.facebook.com/");
		//WebElement searchFeild=driver.findElement(By.cssSelector(".inputtext._55r1._6luy"));//by using classname remove space and add ".".
		//searchFeild.click(); 
		//searchFeild.sendKeys("Hello");
		driver.get("https://www.amazon.in/");
		WebElement searchFeild=driver.findElement(By.tagName("select"));
		searchFeild.click(); 
	}

}
