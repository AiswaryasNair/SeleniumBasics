package KeyBoardMouse;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBoardMouses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ammua\\Documents\\localdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement ele1=driver.findElement(By.id("twotabsearchtextbox"));
		//ele1.sendKeys("laptop"+Keys.ENTER);
		ele1.sendKeys("laptop");
        //ele1.sendKeys(Keys.ENTER);
		
      
        //ele1.sendKeys(Keys.chord(Keys.CONTROL,"a")); //to press two keys simultaneously
		ele1.sendKeys(Keys.BACK_SPACE);
	}

}
