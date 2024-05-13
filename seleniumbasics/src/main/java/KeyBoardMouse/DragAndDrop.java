package KeyBoardMouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ammua\\Documents\\localdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
				
		WebElement source= driver.findElement(By.xpath("//div[@class='ui-widget-content']//li[2]"));
		WebElement destination= driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		Actions actions=new Actions(driver);
		actions.dragAndDrop(source, destination).build().perform();
	}

}
