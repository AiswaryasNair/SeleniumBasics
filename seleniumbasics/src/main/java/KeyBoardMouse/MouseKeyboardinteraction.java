package KeyBoardMouse;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseKeyboardinteraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\ammua\\Documents\\localdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement ele1=driver.findElement(By.id("twotabsearchtextbox"));
		Actions act=new Actions(driver);
		act.clickAndHold().build().perform();//2 types .1.with parameter 2.without parameter.example for method overloading
		//Thread.sleep(1000);
		act.clickAndHold(ele1).build().perform();
		act.release().build().perform();
		//to send data
		act.sendKeys(ele1,"laptop").build().perform();
		act.keyDown(Keys.ENTER).build().perform();
	}

}
