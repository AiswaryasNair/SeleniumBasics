package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ammua\\Documents\\localdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/javascript-alert.php");
		driver.manage().window().maximize();
		WebElement clickme=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		clickme.click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		WebElement clickme2=driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		clickme2.click();
		driver.switchTo().alert().dismiss();
		
		WebElement clickforpromptbox=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		clickforpromptbox.click();
		driver.switchTo().alert().sendKeys("test");
		driver.switchTo().alert().accept();
	}
}
