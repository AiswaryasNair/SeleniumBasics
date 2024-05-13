package Robotex;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadRobot {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ammua\\Documents\\localdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		
		//JavascriptExecutor is an interface and execute javascriptcommand
		
		/*
		 * JavascriptExecutor js=(JavascriptExecutor) driver;
		 * js.executeScript("alert('Aiswarya')");
		 */
		/*
		 * float c=5.5; //int g=c; int g=(int)c;
		 */
		//robot
		WebElement element1 = driver.findElement(By.xpath("//input[@id='file-upload']"));

		String filepath = "C:\\Aiswarya\\Test.txt";
		Actions actions=new Actions(driver);
		Robot robot=new Robot();
		//StringSelection ss = new StringSelection(path);
		actions.moveToElement(element1).click().build().perform();
		StringSelection ss = new StringSelection(filepath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);//write to system clipboard
		robot.delay(1000);//for  copy to toolkit
		robot.keyPress(KeyEvent.VK_CONTROL);//press
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);//release
		robot.keyRelease(KeyEvent.VK_V);
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
