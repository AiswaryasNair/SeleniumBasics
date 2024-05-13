package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ammua\\Documents\\localdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/bootstrap-alert.php");
		driver.manage().window().maximize();
		WebElement enable=driver.findElement(By.xpath("//button[@id='autoclosable-btn-success']"));
		enable.getText();
		String print=enable.getText();
		System.out.println(print);
		boolean enabledstatus=enable.isEnabled();
		System.out.println(enabledstatus);
		boolean displyedstatus=enable.isDisplayed();
		System.out.println(displyedstatus);
		driver.quit();
	}

}
