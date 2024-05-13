package differentxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ammua\\Documents\\localdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*
		 * driver.get("https://selenium.qabible.in/radio-button-demo.php");
		 * driver.manage().window().maximize(); WebElement maleradio =
		 * driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		 * maleradio.click(); WebElement femaleradio =
		 * driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		 * femaleradio.click(); // or use xpth: (//input[@class='nav-input
		 * nav-progressive-attribute'])[1] // syntax://tagName[text()='visible text']
		 * WebElement button =
		 * driver.findElement(By.xpath("//button[text()='Show Selected Value']"));
		 * button.click();
		 */
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement forgotpass = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		forgotpass.click();
	}

}
