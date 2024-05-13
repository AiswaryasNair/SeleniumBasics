package ListSetexa;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForeachExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ammua\\Documents\\localdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();
		
		
		WebElement clickbtn=driver.findElement(By.xpath("//a[text()='Click Here']"));
		
		//WebElement newwindow=driver.findElement(By.xpath("//h3[text()='New Window']"));
		//String str=driver.getWindowHandle();
		//System.out.println(str);
		//clickbtn.click();
		//clickbtn.click();
		
		String parentwindow=driver.getWindowHandle();
		clickbtn.click();
		System.out.println(parentwindow);
		Set<String> str1=driver.getWindowHandles();
		
		for(String windowid:str1) {
			if(parentwindow.equals(windowid)) {
				System.out.println("not needed");
			}
			else {
				driver.switchTo().window(windowid);
				driver.close();
			}
			
			Thread.sleep(5000);
			driver.switchTo().window(parentwindow);
			
		}
		driver.quit();
	}

}
