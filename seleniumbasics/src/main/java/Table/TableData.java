package Table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ammua\\Documents\\localdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/table-pagination.php");
		driver.manage().window().maximize();
		/*
		 * List<WebElement> nameofEmp = driver.findElements(By.
		 * xpath("//table[@class='table table-striped table-bordered table-sm dataTable']//tbody//tr[4]//td[3]"
		 * )); nameofEmp=driver.findElements(By.
		 * xpath("//table[@class='table table-striped table-bordered table-sm dataTable']//td[1]"
		 * )); for(WebElement element:nameofEmp) {
		 * System.out.println(element.getText());
		 */
		 
		List <WebElement> data =driver.findElements(By.xpath("//table[@class='table table-striped table-bordered table-sm dataTable']//tbody//tr[3]//td"));
		for (WebElement d1:data) {
			System.out.println(d1.getText());
		}
		
		List<WebElement>name2=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr[7]//td[1]"));
		for (WebElement d2:name2) {
		System.out.println(d2.getText());
		}
	}

}
