package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ammua\\Documents\\localdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/radio-button-demo.php");
		driver.manage().window().maximize();
		WebElement maleradiodisplyed=driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		boolean maleradiostatus=maleradiodisplyed.isEnabled();
		WebElement femaleradiodisplyed=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
		boolean femaleradiostatus=maleradiodisplyed.isEnabled();
		System.out.println(maleradiostatus);
		System.out.println(femaleradiostatus);
		femaleradiodisplyed.click();
		boolean maleradioselect=maleradiodisplyed.isSelected();
		boolean femaleradioselect=femaleradiodisplyed.isSelected();
		System.out.println(maleradioselect);
		System.out.println(femaleradioselect);
		
	}

}
