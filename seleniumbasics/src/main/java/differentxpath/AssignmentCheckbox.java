package differentxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentCheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ammua\\Documents\\localdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://selenium.qabible.in/check-box-demo.php");
		driver.manage().window().maximize();
		WebElement selectcheckbox=driver.findElement(By.xpath("//input[@class='form-check-input']"));
		selectcheckbox.click();
		WebElement selectall=driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
		selectall.click();
		
	}

}
