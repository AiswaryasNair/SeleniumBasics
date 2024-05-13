package webelemtmethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArrayOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ammua\\Documents\\localdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/");
		driver.manage().window().maximize();
		//syntax : List<WebElement> menuElementList=driver.findElements(By.xapth)
		
		List<WebElement> buttons=driver.findElements(By.xpath("//ul[@class='navbar-nav']//li//a"));
		System.out.println(buttons.size());
		/*
		 * for(int i=0;i<buttons.size();i++) { 
		 * String text=buttons.get(i).getText();
		 * System.out.println(text); }
		 */
	//	syntax:for(WebElement element: listName){}
		//element.getText();
		
	/*
	 * for(WebElement element: buttons){ 
	 * String str=element.getText();
	 * System.out.println(str);
	 * 
	 * }
	 */
	/*
	 * for(WebElement element: buttons){
	 * System.out.println(element.getAttribute("class")); }
	 */
		for(WebElement element: buttons){
			System.out.println(element.getCssValue("background-color"));
		}
	}}
