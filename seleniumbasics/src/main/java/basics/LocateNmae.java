package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateNmae {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ammua\\Documents\\localdriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();//run time polymorphism
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement emailid=driver.findElement(By.name("email"));
		emailid.click();
		emailid.sendKeys("ammuaiswarya1996@gmail.com");// to send data to a input field.it is string type
		emailid.clear();
	}

}
