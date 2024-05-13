package Waitexample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ammua\\Documents\\localdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		driver.manage().window().maximize();
		
      // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
     //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));//latest time will be taken
       
		WebElement start=driver.findElement(By.xpath("//button[text()='Start']"));
		start.click();
		WebElement startPrint=driver.findElement(By.xpath("//div[@class='example']//div[@id='finish']"));
		System.out.println(startPrint.getText());
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));//latest time will be taken
		driver.quit();
	
		
	}


//implicitwait-global wait -applicable to all webelement untill driver terminates.Need to declare only once.Driver -given 
//explicit -applicable to particular webelement.Exception throws for other

	}


