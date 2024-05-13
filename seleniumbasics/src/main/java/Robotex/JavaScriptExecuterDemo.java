package Robotex;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ammua\\Documents\\localdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor) driver;//explicit type casting
		//js.executeScript("window.scrollBy(0,2000)"); //top to bottom scroll down
		WebElement amazonlogo=driver.findElement(By.xpath("//div[@class='nav-logo-base nav-sprite']"));
		//js.executeScript("arguments[0].scrollIntoView();", yourwebelement);
		js.executeScript("arguments[0].scrollIntoView();", amazonlogo);//argument[0] means scroll to the declared webelement
		js.executeScript("arguments[0].click();",amazonlogo);
	}

}
