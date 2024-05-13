package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ammua\\Documents\\localdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		driver.manage().window().maximize();
		WebElement showmessage=driver.findElement(By.xpath("//button[text()='Show Message']"));
		String str1=showmessage.getAttribute("id");
		System.out.println(str1);
		WebElement message=driver.findElement(By.xpath("//input[@id='single-input-field']"));
		String str2=message.getAttribute("class");
		System.out.println(str2);
	}

}
