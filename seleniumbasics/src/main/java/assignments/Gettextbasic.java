package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettextbasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ammua\\Documents\\localdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();
		WebElement message=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		message.sendKeys("Hello");
		WebElement showmsgbtn=driver.findElement(By.xpath("//button[@id='button-one']"));
		showmsgbtn.click();	
		WebElement result=driver.findElement(By.xpath("//div[@id='message-one']"));
		result.getText();
		String print=result.getText();
		System.out.println(print);
		driver.quit();
		
	}

}
