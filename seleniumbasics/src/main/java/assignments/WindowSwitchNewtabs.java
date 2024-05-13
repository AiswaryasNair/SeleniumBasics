package assignments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSwitchNewtabs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ammua\\Documents\\localdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/window-popup.php");
		driver.manage().window().maximize();
		
		WebElement followallbtn=driver.findElement(By.xpath("//a[@id='windowMulti']"));
		String parentwindow=driver.getWindowHandle();
		followallbtn.click();
		Thread.sleep(5000);
		
		Set<String> str1=driver.getWindowHandles();

		Iterator<String> ite=str1.iterator();
	    while(ite.hasNext()) {
	    	String windowid=ite.next();
	    	if(!parentwindow.equals(windowid)) {
	    		driver.switchTo().window(windowid);
	    		System.out.println(driver.getTitle());
	    		driver.close();
	    	}
	    }
        // Switch back to the parent window
        driver.switchTo().window(parentwindow);
        System.out.println("Title of the parent tab: " + driver.getTitle());

        // Close the parent window
        driver.close();
    }
}


