package Table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentlistRedValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ammua\\Documents\\localdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/form-submit.php");
		driver.manage().window().maximize();
		
		WebElement e1=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		e1.click();
		
		//WebElement e2=driver.findElements(By.xpath("//div[@class='invalid-feedback']"));
		List<WebElement>e2 =driver.findElements(By.xpath("//div[@class='invalid-feedback']"));
		int count=e2.size();
		for(int i=0;i<count;i++) {
			{
				String redtext=e2.get(i).getText();
				System.out.println(redtext);
			}
		}
	}
}

