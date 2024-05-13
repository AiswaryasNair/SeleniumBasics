package webelemtmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String states ="California";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ammua\\Documents\\localdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/jquery-select.php");
		driver.manage().window().maximize();
		WebElement dropdown=driver.findElement(By.xpath("(//span[@class='select2-selection__arrow']//b)[1]"));
		dropdown.click();
		WebElement text=driver.findElement(By.xpath("//input[@class='select2-search__field']"));
		text.sendKeys(states);
		////li[contains(text(),'"+state+"')]-concat - dynamic xpath
		WebElement state=driver.findElement(By.xpath("//li[contains(text(),'"+states+"')]"));
		state.click();
		
	}

}
