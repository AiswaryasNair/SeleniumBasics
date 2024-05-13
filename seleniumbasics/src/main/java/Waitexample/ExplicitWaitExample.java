package Waitexample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ammua\\Documents\\localdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		driver.manage().window().maximize();
		//
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		WebElement start=driver.findElement(By.xpath("//button[text()='Start']"));
		wait.until(ExpectedConditions.elementToBeClickable(start));
		start.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='finish']")));
		WebElement startPrint=driver.findElement(By.xpath("//div[@id='finish']"));
		
		
		System.out.println(startPrint.getText());
		//driver.quit();

	}

}
