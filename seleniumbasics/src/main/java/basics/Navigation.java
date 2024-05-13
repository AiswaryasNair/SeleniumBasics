package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ammua\\Documents\\localdriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();//run time polymorphism
		driver.get("https://www.flipkart.com/");
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().to("https://www.flipkart.com/");
		driver.navigate().to("https://www.naukri.com/");
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().back();//to get the previous site
		//driver.navigate().forward();//to forward
		driver.navigate().refresh();//refresh

	}

}
