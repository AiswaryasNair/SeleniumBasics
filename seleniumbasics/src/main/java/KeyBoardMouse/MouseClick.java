package KeyBoardMouse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ammua\\Documents\\localdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		WebElement rightClick = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		WebElement doubleClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions act=new Actions(driver);
		act.click().build().perform();//every time with action need build and perform.Example for method overloading
		
		WebElement element3 = driver.findElement(By.xpath("//a[@class='dropdown-toggle']"));
		Actions actions=new Actions(driver);
		//actions.click(element3).build().perform();*/
		
		actions.contextClick().build().perform();//this also a method overloading .
        actions.contextClick(rightClick).build().perform();//on first button -ie rightclick me
		actions.doubleClick().build().perform();
		actions.doubleClick(doubleClick).build().perform();
	}

}
