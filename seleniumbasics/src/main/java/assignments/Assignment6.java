package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ammua\\Documents\\localdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/check-box-demo.php");
		driver.manage().window().maximize();
		List<WebElement> checkbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(WebElement element: checkbox){
			boolean displaystatus=element.isDisplayed();
			System.out.println(displaystatus);
			boolean enablestatus=element.isEnabled();
			System.out.println(enablestatus);
			
		}
		for(WebElement tag: checkbox){
			String tag1=tag.getTagName();
			System.out.println(tag1);
		}
	}

}
