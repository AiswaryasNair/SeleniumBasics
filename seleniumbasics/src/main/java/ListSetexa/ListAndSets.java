package ListSetexa;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListAndSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ammua\\Documents\\localdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();
		WebElement clickbtn=driver.findElement(By.xpath("//a[text()='Click Here']"));
		clickbtn.click();
		//WebElement newwindow=driver.findElement(By.xpath("//h3[text()='New Window']"));
		String str=driver.getWindowHandle();
		System.out.println(str);
		clickbtn.click();
		//clickbtn.click();
		
		String parentwindow=driver.getWindowHandle();
		System.out.println(parentwindow);
		Set<String> str1=driver.getWindowHandles();
		System.out.println(str1);
		System.out.println(str1.size());
		
	    Iterator<String> ite=str1.iterator();
	    while(ite.hasNext()) {
	    	String windowid=ite.next();
	    	if(!parentwindow.equals(windowid)) {
	    		driver.switchTo().window(windowid);
	    	}
	    }
	    WebElement newwindow=driver.findElement(By.xpath("//h3[text()='New Window']"));
	    System.out.println(newwindow.getText());
	}

}
