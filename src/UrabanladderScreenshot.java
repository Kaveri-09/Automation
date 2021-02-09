import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class UrabanladderScreenshot
{
	public static void main(String []args) throws InterruptedException, IOException
	{
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.urbanladder.com/");
	Thread.sleep(10000);
	driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
	List<WebElement> menues=driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));
	Actions a=new Actions(driver);
	for(WebElement menuName:menues)
	{
	String mName=menuName.getText();
		System.out.println(mName);
		a.moveToElement(menuName).perform();
		TakeScreenShotDemo .Screenshot(driver,mName);
		Thread.sleep(2000);
		List<WebElement> submenues=driver.findElements(By.xpath("//span[contains(.,'"+mName+"')]/parent::li/descendant::ul[@class='taxonslist']"));
		for(WebElement submenuName:submenues)
		{
			System.out.println(submenuName);
			Thread.sleep(2000);
		}
		
	}

	
}
}
