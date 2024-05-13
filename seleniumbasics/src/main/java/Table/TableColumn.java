package Table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ammua\\Documents\\localdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/table-pagination.php");
		driver.manage().window().maximize();
		
	List<WebElement>list1=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[2]"));
	list1.size();
	System.out.println(list1.size());
		for(WebElement d2:list1)
		{
			System.out.println(d2.getText());	
		}
	List<WebElement> ele3= driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr[9]//td[2]"));
	System.out.println(((WebElement) ele3).getText());
	}

}
