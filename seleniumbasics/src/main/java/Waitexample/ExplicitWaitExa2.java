package Waitexample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ammua\\Documents\\localdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/jquery-progress-bar.php");
		driver.manage().window().maximize();
		WebElement ele1=driver.findElement(By.xpath("//button[@id='downloadButton']"));
		ele1.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement cancelbutton=driver.findElement(By.xpath("//button[text()='Cancel Download']"));
		wait.until(ExpectedConditions.invisibilityOf(cancelbutton));
		WebElement ele2=driver.findElement(By.xpath("//div[@class='progress-label']"));
		System.out.println(ele2.isDisplayed());
		System.out.println(ele2.getText());
	}

}
