import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotDemo1 
{
	public static void main(String[] args) throws InterruptedException,AWTException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		WebElement search=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		search.sendKeys("java", Keys.ENTER);
		Actions a=new Actions(driver);
		Thread.sleep(4000);
		a.doubleClick(driver.findElement(By.xpath("//span[contains(.,'Java')]/parent::h2"))).perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		

	}

}
