package webelemtmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ammua\\Documents\\localdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement alldropdown=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		//Select select=new Select(); example of aggregation and parameterised constructor
		Select select=new Select(alldropdown);
		select.selectByIndex(3);
		select.selectByValue("search-alias=aps");
		select.selectByVisibleText("Alexa Skills");

	}

}
