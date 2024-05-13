package webelemtmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ammua\\Documents\\localdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		  driver.get("https://the-internet.herokuapp.com/checkboxes");
		  driver.manage().window().maximize(); 
		  
		  //is-selected method - should take the xpath of the checkbox button
		  //to check is it checked or not
		  WebElement checkbox1 =driver.findElement(By.xpath("(//form[@id='checkboxes']//input)[1]"));
		  WebElement checkbox2 =driver.findElement(By.xpath("(//form[@id='checkboxes']//input)[2]"));
		  boolean checkboxonestatus=checkbox1.isSelected();
		  boolean checkboxtwostatus=checkbox2.isSelected();
		  System.out.println(checkboxonestatus);//o/p-false
		  System.out.println(checkboxtwostatus);//true
		  //driver.quit();//close the entire browzer
		  //driver.close();//will only close the current controlled tab(case of multiple tabs)
		  if(checkboxonestatus==false) {
			  checkbox1.click();
		  }
		  if(checkboxtwostatus==false) {
			  checkbox2.click();
		  }
	}
	

}
