package Table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tablexpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ammua\\Documents\\localdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/table-pagination.php");
		driver.manage().window().maximize();
		
		//WebElement tab1=driver.findElement(By.xpath("//table[@class='table table-striped table-bordered table-sm dataTable']//thead//tr//th[3]"));
		//System.out.println(tab1.getText());
		
		WebElement e1=driver.findElement(By.xpath("//table[@id='dtBasicExample']//thead//tr//th[3]"));
		System.out.println(e1.getText());
		WebElement e2=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[4]//td[3]"));
		System.out.println(e2.getText());
		WebElement e3=driver.findElement(By.xpath("//table[@id='dtBasicExample']//thead//tr//th[2]"));
		
				System.out.println(e3.getText());
		
	//List<WebElement> tableheader = driver.findElements(By.xpath("//table[@class='table table-striped table-bordered table-sm dataTable']//thead//tr//th"));
		List<WebElement> tableheader = driver.findElements(By.xpath("//table[@id='dtBasicExample']//thead//tr//th"));
		int count=tableheader.size();
		for (int i=0;i<count;i++)
		{
			String tag1=tableheader.get(i).getText();
			System.out.println(tag1);
		}

	}

}
