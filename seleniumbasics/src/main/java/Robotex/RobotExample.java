package Robotex;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.security.Key;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotExample {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		//Robot is a javaclasss - fileuploading use robot
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ammua\\Documents\\localdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		//robot.delay(2000);
		
	}

}
