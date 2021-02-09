package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Roycemotordemo 
{
	public static void main(String[] args)
	{
		
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	}

}
