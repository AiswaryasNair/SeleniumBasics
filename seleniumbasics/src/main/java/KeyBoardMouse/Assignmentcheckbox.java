package KeyBoardMouse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignmentcheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ammua\\Documents\\localdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/check-box-demo.php");
		driver.manage().window().maximize();
		
    /*  WebElement b1=driver.findElement(By.xpath("//input[@id='check-box-one']"));
      Actions actions=new Actions(driver);
		actions.click(b1).build().perform();*/
		
		Actions actions=new Actions(driver);
		List<WebElement>l1=driver.findElements(By.xpath("//input[@class='check-box-list']"));
		for(WebElement count:l1)
		{
			actions.click(count).build().perform();
			if(count.isSelected())
			{
				System.out.println("checkbox is selected");
			}
			else
			{
				System.out.println("checkbox is not selected");
			}
			actions.click(count).build().perform();
		
			
		}
driver.quit();		
	}
	}


