package KeyBoardMouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ammua\\Documents\\localdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement ele1=driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		Actions actions=new Actions(driver);
		actions.moveToElement(ele1).build().perform();
		int x=ele1.getLocation().getX();//returns x coordinates
		int y=ele1.getLocation().getY();//returns y 
		//move to offset
		actions.moveByOffset(x, y).build().perform();
	}

}
