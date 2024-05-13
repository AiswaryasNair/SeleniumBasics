package webelemtmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ammua\\Documents\\localdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/social-icon.html");
		driver.manage().window().maximize();
		WebElement linktext1 = driver.findElement(By.xpath("//a[@class='fa fa-lg fa-envelope']"));
		String str1 = linktext1.getAttribute("title");
		System.out.println(str1);

		WebElement linktext2 = driver.findElement(By.xpath("//a[@class ='fa fa-lg fa-google']"));
		String str2 = linktext2.getAttribute("title");
		System.out.println(str2);		

	}

}
