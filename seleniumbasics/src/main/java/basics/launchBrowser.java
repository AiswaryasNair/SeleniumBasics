package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class launchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ammua\\Documents\\localdriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();//run time polymorphism
		//ChromeDriver driver =new ChromeDriver();
		//driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");//launch site
		//driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();//to maximize the window
		driver.getTitle();//to get tab title
		String title=driver.getTitle();
		System.out.println(title);
		driver.getCurrentUrl();//to get current url
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		driver.getCurrentUrl();//refresh-using get
	}

}
