package Robotex;

//import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ammua\\Documents\\localdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame(1);
		WebElement middle=driver.findElement(By.xpath("//div[@id='content']"));
		System.out.println(middle.getText());
		driver.switchTo().defaultContent();//switch back to the main window 
		
		}

}
