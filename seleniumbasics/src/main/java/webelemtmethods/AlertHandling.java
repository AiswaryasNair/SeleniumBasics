package webelemtmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ammua\\Documents\\localdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		WebElement clickforjsalert=driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		clickforjsalert.click();
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().getText() - get the alert text
		WebElement clickforjsconfirm=driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
		clickforjsconfirm.click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		WebElement clickforjsprompt=driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		clickforjsprompt.click();
		driver.switchTo().alert().sendKeys("test");
		driver.switchTo().alert().accept();
	}

}
