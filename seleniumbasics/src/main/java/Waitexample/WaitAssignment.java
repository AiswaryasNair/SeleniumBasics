package Waitexample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ammua\\Documents\\localdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/dynamic-load.php");
		driver.manage().window().maximize();
				//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement ele1=driver.findElement(By.xpath("//button[@id='save']"));
		ele1.click();
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[@class='card-title']")));
		WebElement ele2=driver.findElement(By.xpath("//h5[@class='card-title']"));
		 //ele2.getText();
		System.out.println(ele2.getText());
		WebElement ele3=driver.findElement(By.xpath("//div[@class='card text-center']"));
		boolean value=ele3.isDisplayed();
		//System.out.println(value);
		if (value==true)
		{
			System.out.println("image is displayed");
			
		}
		else
		{
			System.out.println("image is not displayed");
		}	
		
		//driver.quit();
	}

}
