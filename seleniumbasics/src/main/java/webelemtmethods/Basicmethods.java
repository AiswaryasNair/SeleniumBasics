package webelemtmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basicmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ammua\\Documents\\localdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		  driver.get("https://selenium.qabible.in/simple-form-demo.php");
		  driver.manage().window().maximize(); 
		  WebElement showmsg =driver.findElement(By.xpath("//button[@id='button-one']"));
		  showmsg.click();
		  //webelement reference method
		  //getText
		  showmsg.getText();
		  String showmessage=showmsg.getText();
		  System.out.println(showmessage);
		  WebElement yrmsg =driver.findElement(By.xpath("//div[@id='message-one']"));
		  yrmsg.click();
		  String print=yrmsg.getText();
		  System.out.println(print);
		  
	}

}
