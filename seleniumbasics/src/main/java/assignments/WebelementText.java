package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ammua\\Documents\\localdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/bootstrap-dual-list.php");
		driver.manage().window().maximize();
		List<WebElement> options=driver.findElements(By.xpath("//select[@id='bootstrap-duallistbox-nonselected-list_duallistbox_demo1[]']"));
		for(WebElement element: options){
			String printoptions=element.getText();
			System.out.println(printoptions);
			
		}
		
		List<WebElement> options1=driver.findElements(By.xpath("//select[@id='bootstrap-duallistbox-selected-list_duallistbox_demo1[]']"));
		for(WebElement elements: options1){
			String printoptions1=elements.getText();
			System.out.println(printoptions1);
			
		}
	}

}
