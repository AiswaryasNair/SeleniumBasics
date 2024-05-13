package differentxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadiobuttonText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ammua\\Documents\\localdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		  driver.get("https://selenium.qabible.in/radio-button-demo.php");
		  driver.manage().window().maximize(); 
			/*
			 * WebElement malelabel
			 * =driver.findElement(By.xpath("(//label[text()='Male'])[1]"));
			 * malelabel.click();
			 */
		  //syntax--//tagname[contains(text(),'yourtext')] //text having space or not get the xpath with text use contains
		  WebElement inputform =driver.findElement(By.xpath("//a[contains(text(),'Input F')]"));
		  inputform.click();
		  WebElement datepickers =driver.findElement(By.xpath("//a[contains(text(),'Date Pickers')]"));
		  datepickers.click();
		  
		//syntax--//tagName[contains(@attribute,'value')]
		  ////a[contains(@href,'https://www.facebook.com/recover/initiate/')]
		  //syntax--//tagName[starts-with(@attribute,'value')]
		//a[starts-with(@href,'https://www.facebook.com/recover/initiate/')]
		  
	}

}
