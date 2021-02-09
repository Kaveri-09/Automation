package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttonclickdemo 
{
	public static void main(String []args)
	{
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Kishor/OneDrive/Documents/DisabledText.html");
	}

}
