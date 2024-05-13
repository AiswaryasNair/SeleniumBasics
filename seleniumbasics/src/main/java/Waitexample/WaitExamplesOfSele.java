package Waitexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitExamplesOfSele {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ammua\\Documents\\localdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		driver.manage().window().maximize();
       
		WebElement start=driver.findElement(By.xpath("//button[text()='Start']"));
		start.click();
		Thread.sleep(10000);//only freezes code and it will continue untill the timer elapse
		
		WebElement startPrint=driver.findElement(By.xpath("//div[@id='finish']"));
		System.out.println(startPrint.getText());
		driver.quit();
          	
        //selenium wait-we can decide a maximum wait ,it will discard the rest of the wait and continue
		//three types of waits-1.implicit,2.explicit 3.fluent 
		//fluent wait -we can give at wat interval we need to check
		//explicit wait is used most-fluent wait not used frequently
		//polling interval

	}

}
