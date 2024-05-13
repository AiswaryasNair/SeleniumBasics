package assignments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowswitch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ammua\\Documents\\localdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/window-popup.php");
		driver.manage().window().maximize();
		
		WebElement likeusonfacebookbtn=driver.findElement(By.xpath("//a[@class='btn btn-primary windowSingle']"));
		String parentwindow=driver.getWindowHandle();
		likeusonfacebookbtn.click();
		Thread.sleep(5000);
		Set<String> str1=driver.getWindowHandles();
		
	    Iterator<String> ite=str1.iterator();
	    while(ite.hasNext()) {
	    	String windowid=ite.next();
	    	if(!parentwindow.equals(windowid)) {
	    		driver.switchTo().window(windowid);
	    	}
	    }
		WebElement newwindow=driver.findElement(By.xpath("//span[@class='x1lliihq x6ikm8r x10wlt62 x1n2onr6 xg8j3zb']"));
	    System.out.println(newwindow.getText());
	    driver.quit();
	}

}
