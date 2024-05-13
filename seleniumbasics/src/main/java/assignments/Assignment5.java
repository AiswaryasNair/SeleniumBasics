package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ammua\\Documents\\localdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/window-popup.php");
		driver.manage().window().maximize();
		WebElement facebookbtn=driver.findElement(By.xpath("//a[@class='btn btn-primary windowSingle']"));
		String facebooktooltip=facebookbtn.getAttribute("title");
		System.out.println(facebooktooltip);
		WebElement followall=driver.findElement(By.xpath("//a[@id='windowMulti']"));
		String followalltooltip=followall.getAttribute("title");
		System.out.println(followalltooltip);
		String str3 = facebookbtn.getCssValue("background-color");
		System.out.println(str3);
		String str4 = followall.getCssValue("background-color");
		System.out.println(str4);
		driver.quit();
	}

}
