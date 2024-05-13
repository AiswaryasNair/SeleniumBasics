package webelemtmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethodsExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ammua\\Documents\\localdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/bootstrap-alert.php");
		driver.manage().window().maximize();
		WebElement bootstrap1 = driver.findElement(By.xpath("//div[contains(text(), 'Bootstrap Alert')]"));

		// getAttribute : to print class attribute of a webelement
		String str1 = bootstrap1.getAttribute("class");
		System.out.println(str1);

		WebElement autoclose1 = driver.findElement(By.xpath("//button[@id='autoclosable-btn-warning']"));
		String str2 = autoclose1.getAttribute("id");
		System.out.println(str2);
		
		//to get the css value of webelement
		String str3 = autoclose1.getCssValue("background-color");
		System.out.println(str3);
		String str4 = autoclose1.getCssValue("font-style");
		System.out.println(str4);
		String str5 = autoclose1.getCssValue("font-size");
		System.out.println(str5);
		String str6 = autoclose1.getCssValue("color");
		System.out.println(str6);

	}

}
