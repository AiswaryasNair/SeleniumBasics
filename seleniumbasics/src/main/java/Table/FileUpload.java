package Table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ammua\\Documents\\localdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		
		WebElement element1 = driver.findElement(By.xpath("//input[@id='file-upload']"));
		//element1.getText();

		String filepath = "C:\\Aiswarya\\Test.txt";
		element1.sendKeys(filepath);

		WebElement ele2=driver.findElement(By.xpath("//input[@class='button']"));
		ele2.click();
		
		//******one method*********

		//element1.sendKeys(filepath);

		//*******other method*******

		//File file = new File(filepath);

		//element1.sendKeys(file.getAbsolutePath());
	}

}
