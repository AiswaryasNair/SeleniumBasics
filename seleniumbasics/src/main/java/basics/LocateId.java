package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ammua\\Documents\\localdriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();//run time polymorphism
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		WebElement searchFeild=driver.findElement(By.id("twotabsearchtextbox"));
		WebElement searchbutton=driver.findElement(By.id("nav-search-submit-button"));
		searchFeild.click();
		searchFeild.sendKeys("watch");// to send data to a input field.it is string type
		searchFeild.clear();//to remove data
		driver.get("https://Facebook.com");
		WebElement EmailIdFeild= driver.findElement(By.id("email"));
		WebElement Pswd=driver.findElement(By.id("pass"));
		EmailIdFeild.click();
		EmailIdFeild.sendKeys("Aiswarya");
		Pswd.click();
		Pswd.sendKeys("12345");
		
	
	}

}
