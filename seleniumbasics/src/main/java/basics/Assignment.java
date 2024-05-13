package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ammua\\Documents\\localdriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		//driver.get("https://selenium.qabible.in/index.php");
		//driver.get("https://selenium.qabible.in/simple-form-demo.php");
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();//to maximize the window
		/*
		 * driver.getTitle();//to get tab title String title=driver.getTitle();
		 * System.out.println(title); driver.getCurrentUrl();//to get current url String
		 * currenturl=driver.getCurrentUrl(); System.out.println(currenturl);
		 */
		
		/*
		 * WebElement messagefield=driver.findElement(By.id("single-input-field"));
		 * messagefield.click(); messagefield.sendKeys("hello");
		 */
		
		/*
		 * WebElement
		 * messagefield=driver.findElement(By.xpath("//input[@id='single-input-field']")
		 * ); messagefield.click(); messagefield.sendKeys("hello"); WebElement
		 * showmsgbtn=driver.findElement(By.xpath("//button[@id='button-one']"));
		 * showmsgbtn.click();
		 */
		
		WebElement searchfield=driver.findElement(By.xpath("//input[@name='q']"));
		searchfield.sendKeys("watch");
		WebElement searchbutton=driver.findElement(By.xpath("//button[@class='_2iLD__']"));
		searchbutton.click();
		WebElement selectwatch=driver.findElement(By.xpath("//a[@title='Analog Watch  - For Women VH000008C']"));
		selectwatch.click();
		//syntax://parentTag[@attribute='value']//childTag[@attribute='value']
		//amazon serch button--//span[@class='nav-search-submit-text nav-sprite nav-progressive-attribute']//input[@class='nav-input nav-progressive-attribute']
		
	}

}
