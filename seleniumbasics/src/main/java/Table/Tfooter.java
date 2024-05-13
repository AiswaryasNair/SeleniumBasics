package Table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tfooter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ammua\\Documents\\localdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/table-pagination.php");
		driver.manage().window().maximize();
		List<WebElement> tablefooter = driver.findElements(By.xpath("//table[@id='dtBasicExample']//tfoot//tr//th"));
		int count=tablefooter.size();
		for (int i=0;i<count;i++)
		{
			String tag1=tablefooter.get(i).getText();
			System.out.println(tag1);
		}
	}

}
